<%@ page import="java.awt.*" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
</head>
<body>
<div class="container" style="margin-top: 50px">
    <h1 class="text-center mb-3">
       Create new Employee
    </h1>
    <form class="row container d-flex justify-content-center" method="post" action="/add">
        <div class="col-md-6">
            <input placeholder="name" name="name" required class="form-control form-group">
            <input placeholder="wage" type="number" name="wage" required class="form-control form-group">
            <button class="btn btn-success form-group form-control" type="submit">Create</button>
        </div>
    </form>
</div>
</body>
</html>