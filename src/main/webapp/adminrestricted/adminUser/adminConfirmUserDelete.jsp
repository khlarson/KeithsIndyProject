<%@include file="../../head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<div class="container-fluid">
    <h2>Are you sure you wish to delete the following user?? </h2>
    <table>
        <th>First Name</th>
        <th>Last Name</th>
        <th>User ID</th>
        <c:forEach var="user" items="${users}" >
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userid}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="ADMINdeleteUser" method="get">
        <input type="radio" name="confirmDelete" value="No"> No<br>
        <input type="radio" name="confirmDelete" value="Conrfim"> Yes<br>
        <input type="hidden" name="userInput" value=${user.userid} >
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>