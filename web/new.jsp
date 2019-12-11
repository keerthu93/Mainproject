<%-- 
    Document   : new
    Created on : Oct 11, 2019, 1:14:49 PM
    Author     : khsci5mca17031
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <form action="registrationservlet" method="post">
                <div class="form-group">
                     <label for="fn">Firstname :</label>
                     <input type="text" class="form-control" id="fn" placeholder="Enter firstname" name="fn">
                 </div>
                <div class="form-group">
                     <label for="ln">Lastname :</label>
                     <input type="text" class="form-control" id="ln" placeholder="Enter lastname" name="ln">
                 </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                   <div class="input-group mb-3">
                    <div class="input-group">
                    <input type="text" class="form-control" aria-label="Amount (rounded to the nearest dollar)">
                    <span class="input-group-addon">.00</span>
                </div>
</div>
                   
                 
                </div>
                
                <div class="radio">
                    <label><input type="radio" name="optradio" value="S" checked>Student</label>
                 </div>
                 <div class="radio">
                     <label><input type="radio" name="optradio" value="F">Faculty</label>
                </div>
                     <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </body>
</html>
