<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-uhut8PejFZO8994oEgm/ZfAv0mW1/b83nczZzSwElbeILxwkN491YQXsCFTE6+nx" crossorigin="anonymous"><meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1 style="text-align: center">Behold the inner planets!</h1>
<br>
<table class="table">
  <tr>
    <th>Name</th>
    <th>Colors</th>
    <th>Distance From Sun (millions of miles)</th>
  </tr>
  <c:forEach var="c" items="${response}">
  <tr>
    <td>${c.name}</td>
    <td>
    <c:forEach var="a" items="${c.colors}">
    <ul>${a}</ul>
    </c:forEach>
    </td>
    <td>
    <c:forEach var="a" items="${c.milesFromSun}">
    <ul>${a}</ul>
    </c:forEach>
    </td>
  </tr>
  </c:forEach>
</table>
</div>
</body>
</html>