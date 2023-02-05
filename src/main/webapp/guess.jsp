<%--
  Created by IntelliJ IDEA.
  User: joshuamullins
  Date: 2/5/23
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<form action="/guess" method="POST">

  <label for="guess">Pick a number</label>
  <select name="userGuess" id="guess">
    <option value="one">1</option>
    <option value="two">2</option>
    <option value="three">3</option>
  </select>

  <button type="submit">Submit</button>

</form>

</body>
</html>
