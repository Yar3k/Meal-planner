<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <p>Add new user:</p>
    <form:form method="post" modelAttribute="food">

        <form:label path="name">Search for food</form:label>
        <form:input path="name" type="text" required="required" />
        <form:errors path="name" />


        <button type="submit">OK</button>
    </form:form>

    <table border="1">
        <caption>Result</caption>
        <thead>
        <tr>
            <th>Name</th><th>Calories</th><th>Fat</th><th>Protein</th><th>Carbonhydrated</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${foods}" var="food">
            <tr>
                <td>${food.name}</td>
                <td>${food.calories}</td>
                <td>${food.fat_g}</td>
                <td>${food.protein_g}</td>
                <td>${food.carbohydrate_g}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>
<%@ include file="common/footer.jspf"%>