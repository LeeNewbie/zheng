<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26 0026
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
    <h1>Test Hello</h1>
    <c:choose>
        <c:when test="${empty user}">
            <c:redirect url="/test/index"/>
        </c:when>
        <c:otherwise>
            <table>
                <tbody>
                <tr>
                    <td>name</td>
                    <td>${user.username}</td>
                </tr>
                <tr>
                    <td>password</td>
                    <td>${user.password}</td>
                </tr>
                <tr>
                    <td>salt</td>
                    <td>${user.salt}</td>
                </tr>
                <tr>
                    <td>realname</td>
                    <td>${user.realname}</td>
                </tr>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
    <script type="text/javascript">

    </script>
</body>

</html>
