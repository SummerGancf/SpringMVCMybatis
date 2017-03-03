
<%--
  Created by IntelliJ IDEA.
  User: gancaifeng
  Date: 2016/12/1
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>projectALL</title>
</head>
<body>
  <c:forEach var="x" items="${projectAll}">
    <tr>
      <td id="title" colspan="2">projectname：${x.projectname}</td>
    </tr>
  </c:forEach>
</body>
</html>
