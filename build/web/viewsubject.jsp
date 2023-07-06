<%-- 
    Document   : viewsubject
    Created on : May 24, 2023, 12:27:22 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="Controllers.subject"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
    <h1><center>Subjects</center></h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    
    <br>
  
  <table class="table table-info table-striped table-bordered border-black">
  
     
      <thead>
    <tr>
        <th scope="col"><center>Subject ID</center></th>
      <th scope="col"><center>Subject Name</center></th>
      <th scope="col"><center>Credit</center></th>
      <th scope="col"><center>Lecturer</center></th>
      <th scope="col"><center>Delete</center></th>
    </tr>
  </thead>
    
            
      <tbody>    
          
           <% 
                // Retrieve the studentList from the request attribute
                List<subject> studentList = (List<subject>) request.getAttribute("studentList");
                
                // Iterate over the studentList and display the records in the table
                for (subject newstudent : studentList) {
            %>
            
    <tr>
       <td class="px-2 py-2">
                    <%= newstudent.getId() %>
                </td>
                <td class="px-2 py-2">
                   <%= newstudent.getName() %>
                </td>
                <td class="px-2 py-2">
                    <%= newstudent.getCredit() %>
                </td>
                <td class="px-2 py-2">
                    <%= newstudent.getLec() %>
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
