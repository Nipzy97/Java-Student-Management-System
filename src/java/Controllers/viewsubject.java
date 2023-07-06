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
@WebServlet(name = "viewsubject", urlPatterns = {"/viewsubject"})
public class viewsubject extends HttpServlet {

   Connection con;
    PreparedStatement pst;
    ResultSet rs;

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Connection con;
           List<subject> studentList = new ArrayList<>();
            
            
            
            try {
                con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("SELECT * FROM subject");
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                subject subject1 = new subject();
                subject1.setId(rs.getInt("id"));
                subject1.setName(rs.getString("name"));
                subject1.setCredit(rs.getInt("credit"));
                subject1.setLec(rs.getString("lecturer"));
                
                studentList.add(subject1);
                }
                
                
                request.setAttribute("studentList", studentList);
                request.getRequestDispatcher("viewsubject.jsp").forward(request,response);
                
                
            } catch (SQLException ex) {
           Logger.getLogger(viewsubject.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }


}
