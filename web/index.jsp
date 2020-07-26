<%--
  Created by IntelliJ IDEA.
  User: Chulaka
  Date: 2020-07-24
  Time: 1:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Yo Yo</title>
    <link href="./css/landing.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <h2>Enter Info below</h2>
  <form action="ProcessInfo" method="post">
    <label>name: </label>
    <input type="text" name="name">
    <br/>
    <label>height: </label>
    <input type="number" name="height">
    <br/>
    <label>weight: </label>
    <input type="text" name="weight">
    <br/>
    <label>photo url: </label>
    <input type="text" name="imgurl">
    <br/>
    <input type="submit" value="Send">
  </form>
  </body>
</html>
