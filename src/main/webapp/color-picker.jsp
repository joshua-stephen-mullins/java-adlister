<%--
  Created by IntelliJ IDEA.
  User: joshuamullins
  Date: 2/5/23
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>

<form action="/viewcolor" method="POST">

    <label>
        Enter your favorite color:
        <input type="text" name="color">
    </label>
    <button type="submit">Submit</button>

</form>

</body>
</html>
