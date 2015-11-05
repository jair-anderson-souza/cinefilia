/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import controllers.Command;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author jederson
 */
public class UploadFileCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        boolean isMultiPart = FileUpload.isMultipartContent(request);

        if (isMultiPart) {

            FileItemFactory factory = new DiskFileItemFactory();

            ServletFileUpload upload = new ServletFileUpload(factory);

            String formulario = "";

            try {

                List items = upload.parseRequest(request);

                Iterator iter = items.iterator();

                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();
                    if (item.getFieldName().equals("tipoForm")) {
                        formulario = item.getString();
                    }

                    if (!item.isFormField()) {
                        if (item.getName().length() > 0) {
                            this.inserirImagem(item);
                        }
                    }

                }

            } catch (FileUploadException ex) {

                ex.printStackTrace();
            }
        }

    }

    private void inserirImagem(FileItem item) {
        Connection conexao = null;        
        PreparedStatement declaracao = null;
        String sql = "INSERT INTO TabelaTeste (codigo, imagem) VALUES(?, ?)";              
        
        try {
            declaracao = conexao.prepareStatement(sql);
            declaracao.setInt(1, 1); // codigo 1
            declaracao.setBinaryStream(2, item.getInputStream(),(int) item.getSize());
            declaracao.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    

}
