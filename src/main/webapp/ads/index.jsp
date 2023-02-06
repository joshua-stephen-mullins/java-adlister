<%--
  Created by IntelliJ IDEA.
  User: joshuamullins
  Date: 2/6/23
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Look At Some Ads" />
    </jsp:include></head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<main>
    <h1 class="text-center mb-3">Ads</h1>
    <div class="d-flex justify-content-around row">

        <c:forEach var="ad" items="${ads}">
            <div class="col-2 border border-1 rounded-3 d-flex flex-column">
                <h3 class="text-center">${ad.title}</h3>
                <p>${ad.description}</p>
            </div>
        </c:forEach>

    </div>
</main>
</body>
</html>
