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
@WebServlet(name = "markscontroller", urlPatterns = {"/markscontroller"})
public class markscontroller extends HttpServlet {

    Connection con;
        PreparedStatement pst;
        ResultSet rs;     
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userID = request.getParameter("id");
            String subjectID = request.getParameter("sid");
            String subject = request.getParameter("sub");
            String marks = request.getParameter("marks");
            String coloumn = request.getParameter("grade");
        
            PrintWriter out = response.getWriter();
             Connection con;
             
             try{
            con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("INSERT INTO marks (userID,subjectID,subject,marks,coloumn) VALUES (?,?,?,?,?)");
            
                pst.setString(1, userID);
                pst.setString(2, subjectID);
                pst.setString(3, subject);
                pst.setString(4, marks);
                pst.setString(5, coloumn);
                
                pst.executeUpdate();
                
                
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            } catch (SQLException ex) {
            Logger.getLogger(markscontroller.class.getName()).log(Level.SEVERE, null, ex);
            out.print(ex);
        }
        
    }

}
