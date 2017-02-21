<%@include file="../../head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>

<div class="container-fluid">
    <h2>Are you sure you wish to delete the following msg?? </h2>
    <table>
        <th>Your Message: </th>
        <c:forEach var="msg" items="${msgs}" >
            <tr>
                <td>${msg.content}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="USERdeleteMsg" method="get">
        <input type="radio" name="confirmDelete" value="No"> No<br>
        <input type="radio" name="confirmDelete" value="Conrfim"> Yes<br>
        <input type="hidden" name="userInput" value=${msg.msgid} >
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
