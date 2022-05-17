<%--
  Created by IntelliJ IDEA.
  User: jeonghun
  Date: 2022/05/09
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1><%=request.getParameter("year")%></h1>
<p>${year} 년 ${month} 월 ${day}일은 ${yoil} 입니다.</p>
</body>
</html>
