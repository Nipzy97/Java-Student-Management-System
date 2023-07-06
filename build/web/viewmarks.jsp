<%-- 
    Document   : viewmarks
    Created on : May 24, 2023, 3:37:07 PM
    Author     : Admin
--%>

<%@page import="Controllers.marks"%>
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
      <h1><center>Marks</center></h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
  <table class="table table-info table-striped table-bordered border-black">
  
     
      <thead>
    <tr>
        <th scope="col"><center>UserID</center></th>
      <th scope="col"><center>SubjectID</center></th>
      <th scope="col"><center>Subject</center></th>
      <th scope="col"><center>Marks</center></th>
      <th scope="col"><center>Coloumn</center></th>
      <th scope="col"><center>Delete</center></th>
      
    </tr>
  </thead>

  <tbody>
          
           <% 
                // Retrieve the studentList from the request attribute
                List<marks> marksList = (List<marks>) request.getAttribute("marksList");
                
                // Iterate over the studentList and display the records in the table
                for (marks newstudent : marksList) {
            %>
            
    <tr>
       <td class="px-6 py-4">
                    <%= newstudent.getuserID() %>
                </td>
                <td class="px-2 py-2">
                   <%= newstudent.getSubjectID() %>
                </td>
                <td class="px-2 py-2">
                    <%= newstudent.getSubject() %>
                </td>
                <td class="px-2 py-2">
                    <%= newstudent.getaMarks() %>
                </td>
                <td class="px-2 py-2">
                    <%= newstudent.getColoumn() %>
                </td>
                <td class="px-2 py-2">
                   <button type="button" class="btn btn-dark">Delete</button>
                </td>
                
    </tr>
    
    <% 
                }
            %>

  
    
  </tbody>
</table>
  
  
  
  
  </body>
</html>