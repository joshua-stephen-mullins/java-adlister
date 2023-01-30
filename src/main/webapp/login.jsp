<html>
<%@include file="/partials/header.jsp" %>
<body>
<%@include file="/partials/navbar.jsp"%>
<div class="d-flex flex-column align-items-center">
    <form class="col-6" action="/login.jsp" method="POST">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Username</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="username">
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name="password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<% request.setAttribute("username", request.getParameter("username")); %>
<% request.setAttribute("password", request.getParameter("password")); %>

<c:choose>
    <c:when test="${username == 'admin' && password == 'password'}">
        <% response.sendRedirect("/profile.jsp"); %>
    </c:when>
    <c:when test="${username != null && password != null}">
        <% response.sendRedirect("/login.jsp"); %>
    </c:when>
</c:choose>


</body>
<%@include file="/partials/script-tags.jsp" %>
</html>
