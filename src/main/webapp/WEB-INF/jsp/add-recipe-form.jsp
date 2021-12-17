<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><link href="static/css/bootstrap.min.css" rel="stylesheet"/>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<div class="container">
    <div id="wrapper">
        <div class="header">
            <h2>Calorie-Counter: Add New Recipe</h2>
        </div>
    </div>

    <form:form action="add-recipe" modelAttribute="addRecipeRequest" method="POST">

        <table class="table table-bordered">
            <thead>
            <tr>
                <th>
                    <h3>Add Ingridients for a recipe</h3>
                </th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <td>
                    <label>Choose a name for your new recipe:</label>
                    <form:input path="recipeName"/>
                </td>

            </tr>
            <tr>
                <td>
                    Select first ingredient:&nbsp;
                    <select name="recipe1">
                        <c:forEach items="${ingredients}" var="ingredient">
                            <option value="${ingredient.name}">${ingredient.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>

                <td>
                    Select second ingredient:&nbsp;
                    <select name="recipe2">
                        <c:forEach items="${ingredients}" var="ingredient">
                            <option value="${ingredient.name}">${ingredient.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>

                <td>
                    Select third ingredient:&nbsp;
                    <select name="recipe3">
                        <c:forEach items="${ingredients}" var="ingredient">
                            <option value="${ingredient.name}">${ingredient.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    Select fourth ingredient:&nbsp;
                    <select name="recipe4">
                        <c:forEach items="${ingredients}" var="ingredient">
                            <option value="${ingredient.name}">${ingredient.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td><input type="submit" value="Save" class="save"/></td>
            </tr>
            </tbody>
        </table>
    </form:form>


    <div class="col-md-12">
        <div class="table-responsive " id="preptable">

            <table class="table table-bordered table-hover text-center"
                   data-toggle="">
                <thead>
                <tr class="">
                    <th data-field=id data-filter-control="select"
                        data-sortable="true">Name
                    </th>
                    <th data-field=echantillons data-filter-control="select"
                        data-sortable="true">Calories
                    </th>
                    <th data-field=conditionnement data-filter-control="select"
                        data-sortable="true">Protein
                    </th>
                    <th data-field=transporteur data-filter-control="select"
                        data-sortable="true">Carbs
                    </th>
                    <th data-field=etat data-filter-control="select"
                        data-sortable="true">Fats
                    </th>

                    <th data-field=etat data-filter-control="select"
                        data-sortable="true">Ingredients
                    </th>

                    <th data-field=etat data-filter-control="select"
                        data-sortable="true">Remove recipe
                    </th>
                </tr>

                </thead>
                <tbody>
                <c:forEach items="${recipes}" var="recipe">
                    <tr>
                        <td>${recipe.name}</td>
                        <td>${recipe.calories}</td>
                        <td>${recipe.protein}</td>
                        <td>${recipe.carbs}</td>
                        <td>${recipe.fat}</td>
                        <td>
                    <c:forEach items="${recipe.getIngredientList()}" var="prod">
                            ${prod.name}</br>
                    </c:forEach>
                        </td>
                        <td> <a class="btn btn-danger" href="${pageContext.request.contextPath}/recipe/delete/${recipe.id}" role="button">Delete recipe</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <p>
                <a href="${pageContext.request.contextPath}/main-menu">Back to main page</a>
            </p>
        </div>

    </div>
</div>
</body>

</html>







