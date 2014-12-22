<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<form:form modelAttribute="user" action="${cxt}/valid/valid" method="post">

    <form:input path="stuName"/>${stuName}
    <input type="submit"/>

</form:form>
</body>
</html>
