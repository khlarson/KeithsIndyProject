<%@include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <th>First Name</th>
        <th>Last Name</th>
        <th>User ID</th>
        <th>Age</th>

    <c:forEach var="user" items="${users}" >
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.userid}</td>
            <td>${user.calculateAge(user.dateOfBirth)}</td>
        </tr>
    </c:forEach>
    </table>

</div>

</body>
</html>
