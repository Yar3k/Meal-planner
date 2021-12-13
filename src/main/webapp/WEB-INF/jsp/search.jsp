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

    <p>Result: ${foods.toString()} </p>
</div>
<%@ include file="common/footer.jspf"%>