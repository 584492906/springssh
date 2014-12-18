<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<c:forEach items="${stuList}" var="stu">
    <label>学号:</label>${stu.stuId}
    <label>姓名:</label>${stu.stuName}
    </br>
</c:forEach>
<form action="/method/method2/" method="post">
    ${s}
    <input type="text" name="stuname"/>
    <input type="text" name="userpass"/>
    <input type="submit"/>

</form>
</body>
</html>
