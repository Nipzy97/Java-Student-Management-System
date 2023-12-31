<%-- 
    Document   : login
    Created on : Feb 23, 2023, 9:56:49 AM
    Author     : Rukshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
 
    <title>Login</title>

    <!-- Link bootstrap css -->
    <link rel="stylesheet" href="CSS/bootstrap.min.css">

    <!-- Link jquery and Javascript -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
    <style>
    body {
      background-image: url('image/uni.jpg');
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: 100% 110%;
    }
  </style>

</head>

<body>
    
     <%
          String message = (String) request.getAttribute("Message");
          if(message != null){
        %>
        <h3><%=message %></h3>
        <%
           } 
         %>

    <div class="container" style="margin-top:80px;background-size:cover;background-position:center;padding-left:400px;padding-top:50px;padding-right:400px;padding-bottom:20px">
       
        <div class="row">
            
            <div class="card text-dark mb-3" style="background-color:rgba(0, 191, 255, 0.2)">

                <div class="card-header">
                    <center><b><h4>Login</h4></b></center>
                </div>

                <div class="card-body">

                    <form method="POST" action="LoginController">

                        <div class="mb-3">
                          <label for="exampleInputEmail1" class="form-label">User Email</label>
                          <input type="mail" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Your Username">
                        </div>

                        <div class="mb-3">
                          <label for="exampleInputPassword1" class="form-label">Password</label>
                          <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Enter Your Password" aria-placeholder="Enter Your Password">
                        </div>

                        <div class="mb-3 form-check">
                          <input type="checkbox" class="form-check-input" id="exampleCheck1">
                          <label class="form-check-label" for="exampleCheck1">Remember Username</label>
                        </div>

                        <button type="submit" class="btn btn-primary">Login</button>
                        <button type="button" class="btn btn-outline-dark">Reset</button>

                        <p><center>Don't have an account? <a href = "register.jsp">Sign up</a></center></p>

                      </form>

                </div>

            </div>       
        
        </div>

    </div>

    
 
</body>

</html>
