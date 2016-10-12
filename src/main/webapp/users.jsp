<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>users))</title>
</head>
<body>
<%int count = 0; %>
<table border="1">
    <c:forEach items="${userList}" var="usr">
        <tr>
            <td>
                User <%=++count%>
            </td>
            <td>
                <c:out value="${usr.name}"/>
            </td>
            <td>
                <c:out value="${usr.id}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
