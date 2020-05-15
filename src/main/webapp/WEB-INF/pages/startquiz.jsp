<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeQuiz: Start Quiz</title>
</head>
<body>
<h1>Start Quiz</h1>
<div style="width:80%; margin:0 auto">
<!--  question number and question -->
  <h2>1. What is the capital of India?</h2>
  <form:form method="get">
 	<div style="color: white;background-color:DodgerBlue" onclick="alert('Delhi')"> Delhi</div>
    <div style="color: white;background-color:Red" onclick="alert('Mumbai')"> Mumbai</div>
    <div style="color: white;background-color:Green" onclick="alert('Kolkata')"> Kolkata</div>
    <div style="color: white;background-color:Orange" onclick="alert('Chennai')"> Chennai</div>
  </form:form>
<br /><a href="/">Home</a>
</div>
</body>
</html>