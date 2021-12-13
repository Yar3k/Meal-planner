<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    <p>Add new user:</p>
  <form:form method="post" modelAttribute="user">

      <form:input path="id" type="hidden" required="required" />
      <form:errors path="id" />

      <form:label path="name">Name</form:label>
      <form:input path="name" type="text" required="required" />
      <form:errors path="name" />

      <form:label path="email">Email</form:label>
      <form:input path="email" type="email" required="required" />
      <form:errors path="email" />

      <form:label path="password">Password</form:label>
      <form:input path="password" type="password" required="required" />
      <form:errors path="password" />



        <button type="submit">OK</button>
    </form:form>
</div>
<%@ include file="common/footer.jspf"%>