<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<div class="container">
    <div id="wrapper">
        <div class="header">
            <h2>Ingredient calorie counter</h2>
        </div>
    </div>

    <form:form action="nutrition" modelAttribute="ingredient" method="POST">


            Select first ingredient:&nbsp;
            <select name="name">
                <c:forEach items="${ingredients}" var="ingredient">
                    <option value="${ingredient.name}">${ingredient.name}</option>
                </c:forEach>
            </select>


                <td><input type="submit" value="Calculate" class="save"/></td>
            </tr>
    </form:form>

    <table class="table table-striped">
        <tbody>
        <tr>
            <th scope="col">Nutrition</th>
            <td>Product name</td>
            <td>Calories</td>
            <td>Protein</td>
            <td>Carbohydrate</td>
            <td>Fat</td>
        </tr>
        <tr>
            <th scope="col">Values</th>
            <td>${result.name}</td>
            <td>${result.calories}</td>
            <td>${result.protein}</td>
            <td>${result.carbohydrate}</td>
            <td>${result.fat}</td>
        </tr>
        </tbody>
    </table>

    </div>
</div>
</body>
</html>







