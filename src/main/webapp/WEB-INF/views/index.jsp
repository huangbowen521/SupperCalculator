<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<title>����������</title>
</head>

<body>

<form:form id="calculator" modelAttribute="calculator">
  <form:input path="first" />
  <form:input path="second" />

  <p th:text="${result}">
  <button type="submit">����</button>


</form:form>


</body>
</html>