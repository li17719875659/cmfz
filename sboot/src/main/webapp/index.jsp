<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
<h2>Hello World!</h2>
name:${requestScope.name}
<c:forEach items="${requestScope.users}" var="user">
    姓名: ${user.name}
    生日:<fmt:formatDate value="${user.bir}" pattern="yyyy-MM-dd" ></fmt:formatDate>
</c:forEach>
</body>
</html>
