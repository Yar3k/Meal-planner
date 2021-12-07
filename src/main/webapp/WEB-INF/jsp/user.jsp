<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    <p>Add new user:</p>
    <form:form method="post" modelAttribute="user">

        <form:label path="id">ID</form:label>
        <form:input path="id" type="number" required="required" />
        <form:errors path="id" />

        <form:label path="name">Name:</form:label>
        <form:input path="name" type="text" required="required" />
        <form:errors path="name" />


        <button type="submit">OK</button>
    </form:form>
</div>
<%@ include file="common/footer.jspf"%>