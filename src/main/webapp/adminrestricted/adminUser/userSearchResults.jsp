<%@include file="../../head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table>
        <th>First Name</th>
        <th>Last Name</th>
        <th>User ID</th>
        <th>Remove User</th>
    <c:forEach var="user" items="${users}" >
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.userid}</td>
            <td>
                <form action="ADMINdeleteUser" method="get">
                    <input type="hidden" name="userInput" value=${user.userid} >
                    <input type="hidden" name="confirmDelete" value="?" >
                    <input type="submit" value="Delete User">
                </form>
            </td>
        </tr>
    </c:forEach>
    </table>
</div>

</body>
</html>
