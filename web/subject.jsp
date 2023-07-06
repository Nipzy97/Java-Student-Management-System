<%-- 
    Document   : subject.jsp
    Created on : May 21, 2023, 3:06:52 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    
    <style>
    body {
      background-image: url('image/uni2.jpg');
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: 100% 110%;
    }
  </style>
  
  </head>
  <body>
      <h1><center>ABC University</center></h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
     <div class="container" style="margin-top:80px;background-size:cover;background-position:center;padding-left:350px;padding-top:0px;padding-right:350px;padding-bottom:20px">
        
        <div class="row">
            
            <div class="card text-dark mb-3" style="background-color:rgba(0, 191, 255, 0.2)">

                <div class="card-header">
                    <center><b><h4>Register</h4></b></center>
                </div>

                <div class="card-body">

                    <form method="POST" action="subjectcontroller">

                        <div class="mb-3">
                          <label for="exampleInputEmail1" class="form-label">Subject ID</label>
                          <input type="number" class="form-control" id="exampleInputName" name="id" aria-describedby="namelHelp" placeholder="Enter Subject ID" required>
                        </div>

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Subject Name</label>
                            <input type="text" class="form-control" id="exampleInputNIC1" name="name" aria-describedby="niclHelp" placeholder="Enter Subject Name" required>
                        </div>

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Credits</label>
                            <input type="number" class="form-control" id="exampleInputEmail" name="credit" aria-describedby="emailHelp" placeholder="Enter Credits" required>
                          </div>

                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Lecturer Name</label>
                            <input type="text" class="form-control" id="exampleInputPassword1" name="lecname" placeholder="Enter Lecturer Name" required>
                        </div>

                        <div class="mb-3 form-check">
                          <input type="checkbox" class="form-check-input" id="exampleCheck1">
                          <label class="form-check-label" for="exampleCheck1">Terms & Conditions</label>
                        </div>

                        <button type="submit" class="btn btn-primary">Register</button>
                        <button type="button" class="btn btn-outline-dark">Reset</button>

                        <p><center>Already Registerd? <a href = "login.jsp">Login</a></center></p>

                      </form>

                </div>

            </div>       
        
        </div>

    </div>
    </body>
</html>
