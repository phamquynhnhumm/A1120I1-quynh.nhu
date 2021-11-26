<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>tinh</title>
</head>
<body>
<p>Số a có giá trị :
    <c:out  value="${soa1}"/>
</p>
<p>Số b có giá trị :
    <c:out  value="${soc1}"/>
</p>
<p>Kết quả phép
    <c:out  value="${pheptinh}"/>
    của hai số a và b là:
</p>
<c:choose>
    <c:when test="${pheptinh =='+'}">
        <p>
            ${soa1 +soc1}
        </p>
    </c:when>
    <c:when test="${pheptinh =='-'}">
        <p>
                ${soa1  - soc1}
        </p>
    </c:when>
    <c:when test="${pheptinh =='x'}">
        <p>
                ${soa1  * soc1}
        </p>
    </c:when>
    <c:when test="${pheptinh =='/'}">
        <p>
                ${soa1 / soc1}
        </p>
    </c:when>
</c:choose>
</body>
</html>
