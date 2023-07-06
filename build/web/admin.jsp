<%-- 
    Document   : admin
    Created on : May 20, 2023, 2:10:45 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
    body {
      background-image: url('image/uni3.png');
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: 100% 110%;
    }
    
    .card{
        background-color: lightblue;
        background-size: 10px;
        font-size: 25;
        font-color: Dark;
        width: 20rem;
        
    }
  </style>
  
    </head>
    <body>
        <h1><center> Admin Dashboard </center></h1>
         <div class="card">
  <div class="card-body">
      <h3>User Management</h3>
  </div>
      
</div>  
        
             <a class="btn btn-primary" href="http://localhost:8084/ABC_University_C/registation.jsp"> Enter User</a>
             <a href="../src/java/Controllers/subject.java"></a>
             
              <form action="viewuser" method="POST">
                  
                  <button type="submit" class="btn btn-primary">View User</button>
              </form>
              
              <br>
              <br>
              
              <div class="card">
  <div class="card-body">
      <h3>Subject Management</h3>
  </div>
      
</div>
            
              <a class="btn btn-primary" href="http://localhost:8084/ABC_University_C/subject.jsp"> Enter Subject</a>
              
              <form action="viewsubject" method="POST">
                  
                  <button type="submit" class="btn btn-primary">View Subject</button>
              </form>  
                  
                  <br>
              <br>
              
              <div class="card">
  <div class="card-body">
      <h3>Degree Management</h3>
  </div>
      
</div>
            
              <a class="btn btn-primary" href="http://localhost:8084/ABC_University_C/degree.jsp"> Enter Degree Program</a>
              
              <form action="viewdegree" method="POST">
                  
                  <button type="submit" class="btn btn-primary">View Degree Program</button>
              </form>
                  
                  <br>
                  
                  <br>
              
              <div class="card">
  <div class="card-body">
      <h3>Insert Marks</h3>
  </div>
      
</div>
            
              <a class="btn btn-primary" href="http://localhost:8084/ABC_University_C/marks.jsp"> Enter Marks</a>
              
              <form action="viewmarks" method="POST">
                  <button type="submit" class="btn btn-primary">View Marks</button>
        </form>
                      
    </body>
</html>
