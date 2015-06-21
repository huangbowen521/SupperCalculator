<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<meta charset="UTF-8">
<title>Supper Calculator</title>
</head>

<body>

<form:form method="POST" action="calculate" modelAttribute="calculator">
  <form:input path="firstNumber" /> +
  <form:input path="secondNumber" />
  <button type="submit">calculate</button>

  <p>This is the result: <div id="result">${result}</div></p>


</form:form>


</body>
</html>