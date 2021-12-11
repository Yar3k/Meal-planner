<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <p>Add new user:</p>
    <form:form method="post" modelAttribute="bmi">

        <form:label path="weight">Weight</form:label>
        <form:input path="weight" type="number" required="required" />
        <form:errors path="weight" />

        <form:label path="height">Height</form:label>
        <form:input path="height" type="number" required="required" />
        <form:errors path="height" />


        <button type="submit">OK</button>
    </form:form>

    <p>Result: ${bmi.getStatus()} (${bmi.getResult()})</p>
</div>