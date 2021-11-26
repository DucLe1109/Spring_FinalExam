<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body class="container">
<h1 class="text-center mb-3 mt-3">
    List new Employee
</h1>
<a href="/add" style="float: right;margin-bottom: 10px" class="btn btn-success">Add new</a>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Wage</th>
        <th>Action</th>
    </tr>
    <c:forEach var="item" items="${requestScope.list_emp}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>$${item.wage}</td>
            <td><a class="btn btn-primary" href="/edit/${item.id}">Edit</a>
                <a onclick="confirm('Are you sure?')" class="btn btn-danger" href="/delete/${item.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
