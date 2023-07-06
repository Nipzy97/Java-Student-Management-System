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
public class viewuser {
    
    @WebServlet(name = "viewuser", urlPatterns = {"/viewuser"})
public class viewsubject extends HttpServlet {

   Connection con;
    PreparedStatement pst;
    ResultSet rs;

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Connection con;
           List<user> userList = new ArrayList<>();
            
            
            
            try {
                con = DatabaseConnection.connectToDatabase("jdbc:mysql://localhost/university", "root", "");                
                pst = con.prepareStatement("SELECT * FROM user");
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                user user1 = new user();
                user1.setId(rs.getInt("id"));
                user1.setName(rs.getString("name"));
                user1.setNic(rs.getString("nic"));
                user1.setEmail(rs.getString("email"));
                user1.setPassword(rs.getString("password"));
                user1.setRole(rs.getInt("role"));
                
                userList.add(user1);
                }
                
                
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("viewuser.jsp").forward(request,response);
                
                
            } catch (SQLException ex) {
           Logger.getLogger(viewuser.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }


}
}
