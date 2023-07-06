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
@WebServlet(name = "degreecontroller", urlPatterns = {"/degreecontroller"})
public class degreecontroller extends HttpServlet {

Connection con;
        PreparedStatement pst;
        ResultSet rs;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
            String name = request.getParameter("name");
            String sem = request.getParameter("sem");
            String type = request.getParameter("type");
        
            PrintWriter out = response.getWriter();
             Connection con;
            try{
            con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("INSERT INTO degree (`id`, `name`, `semester`, `type`) VALUES (?,?,?,?)");
            
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, sem);
                pst.setString(4, type);
                
                pst.executeUpdate();
                
                
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            } catch (SQLException ex) {
        Logger.getLogger(degreecontroller.class.getName()).log(Level.SEVERE, null, ex);
    }
            
    }


}
