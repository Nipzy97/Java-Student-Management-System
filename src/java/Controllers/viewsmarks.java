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
import java.util.ArrayList;
import java.util.List;
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

    
    @WebServlet(name = "viewmarks", urlPatterns = {"/viewmarks"})
public class viewsmarks extends HttpServlet {

   Connection con;
    PreparedStatement pst;
    ResultSet rs;

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Connection con;
           List<marks> marksList = new ArrayList<>();
            
            
            
            try {
                con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("SELECT * FROM marks");
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                marks marksl = new marks();
                marksl.setUserID(rs.getInt("userID"));
                marksl.setSubjectID(rs.getInt("subjectID"));
                marksl.setSubject(rs.getString("subject"));
                marksl.setMarks(rs.getInt("marks"));
                marksl.setColoumn(rs.getString("coloumn"));
                
                
                marksList.add(marksl);
                }
                
                
                request.setAttribute("marksList", marksList);
                request.getRequestDispatcher("viewmarks.jsp").forward(request,response);
                
                
            } catch (SQLException ex) {
           Logger.getLogger(viewmarks.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }


}

