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
@WebServlet(name = "viewdegree", urlPatterns = {"/viewdegree"})
public class viewdegree extends HttpServlet {
    
      Connection con;
         PreparedStatement pst;
         ResultSet rs;
    
        
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Connection con;
           List<degree> DegreeList = new ArrayList<>();
           
try {
                con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("SELECT * FROM degree");
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                degree degree1 = new degree();
                degree1.setId(rs.getInt("id"));
                degree1.setName(rs.getString("name"));
                degree1.setSemester(rs.getString("semester"));
                degree1.setType(rs.getString("type"));
                
                DegreeList.add(degree1);
                }
                
                out.print(DegreeList);
                
                
                request.setAttribute("DegreeList", DegreeList);
                request.getRequestDispatcher("viewdegree.jsp").forward(request,response);
                
                
            } catch (SQLException ex) {
           Logger.getLogger(viewsubject.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }


}
           
           
        
    

    

