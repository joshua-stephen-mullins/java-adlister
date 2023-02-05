<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="partials/head.jsp" %>
<body>
<form action="/pizza-order" method="POST">
    <h2>Select a Crust</h2>
    <select class="form-select" name="crust" required>
        <option value="hand-tossed">Hand-Tossed</option>
        <option value="thin">Thin</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <h2>Select a Sauce</h2>
    <select class="form-select" name="sauce" required>
        <option value="bbq">BBQ</option>
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
    </select>
    <h2>Select a Size</h2>
    <select class="form-select" name="size" required>
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <h2>Select a Topping</h2>
    <div class="form-check">
        <input class="form-check-input" name="topping" type="checkbox" value="pepperoni" id="pepperoni">
        <label class="form-check-label" for="pepperoni">
            Pepperoni
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" name="topping" type="checkbox" value="salami" id="salami">
        <label class="form-check-label" for="salami">
            Salami
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" name="topping" type="checkbox" value="ham" id="ham">
        <label class="form-check-label" for="ham">
            Ham
        </label>
    </div>
    <h2>Input Delivery Address</h2>
    <input class="form-control" type="text" placeholder="Delivery Address" name="delivery-address" required>
    <button type="submit" class="btn btn-primary">Order</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
