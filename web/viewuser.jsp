<%-- 
    Document   : viewuser
    Created on : May 24, 2023, 2:52:07 PM
    Author     : Admin
--%>

<%@page import="Controllers.user"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
    <h1>Hello, world!</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
  <table class="table">
  
     
      <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">name</th>
      <th scope="col">nic</th>
      <th scope="col">email</th>
      <th scope="col">password</th>
      <th scope="col">roll</th>
    </tr>
  </thead>
    
            
      <tbody>
          
           <% 
                // Retrieve the studentList from the request attribute
                List<user> userList = (List<user>) request.getAttribute("userList");
                
                // Iterate over the studentList and display the records in the table
                for (user newstudent : userList) {
            %>
            
    <tr>
       <td class="px-6 py-4">
                    <%= newstudent.getId() %>
                </td>
                <td class="px-6 py-4">
                   <%= newstudent.getName() %>
                </td>
                <td class="px-6 py-4">
                    <%= newstudent.getNic() %>
                </td>
                <td class="px-6 py-4">
                    <%= newstudent.getEmail() %>
                </td>
                <td class="px-6 py-4">
                    <%= newstudent.getPassword() %>
                </td>
                <td class="px-6 py-4">
                    <%= newstudent.getRole() %>
                </td>
    </tr>
    
    <% 
                }
            %>

  
    
  </tbody>
</table>
  
  
  
  
  </body>
</html>