/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Beans.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "subjectcontroller", urlPatterns = {"/subjectcontroller"})
public class subjectcontroller extends HttpServlet {

    Connection con;
        PreparedStatement pst;
        ResultSet rs;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
            String name = request.getParameter("name");
            String credit = request.getParameter("credit");
            String lecturer = request.getParameter("lecname");
            
            
            
            PrintWriter out = response.getWriter();
            
            Connection con;
            try{
            con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("INSERT INTO subject (`id`, `name`, `credit`, `lecturer`) VALUES (?,?,?,?)");
            
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, credit);
                pst.setString(4, lecturer);
                
                pst.executeUpdate();
                
                
                
            } catch (SQLException ex) {
            Logger.getLogger(subjectcontroller.class.getName()).log(Level.SEVERE, null, ex);
            
            out.print(ex);
        }
            
            request.getRequestDispatcher("admin.jsp").forward(request, response);
       
    }

}
