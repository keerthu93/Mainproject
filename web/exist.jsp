<%-- 
    Document   : exist
    Created on : Oct 11, 2019, 1:05:58 PM
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
            <form action="existservlet" method="post">
                <div class="form-group">
                     <label for="un">Username :</label>
                     <input type="text" class="form-control" id="un" placeholder="Enter user name" name="un">
                 </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
                 </div>
                <div class="checkbox">
                     <label><input type="checkbox" name="remember"> Remember me</label>
                </div>
                     <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
       
    </body>
</html>
