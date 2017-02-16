<%@include file="../head.jsp"%>
<html>
<body>
<h2>Mad Town Hopper Search Users</h2>
<form action="searchUser" method="get">
    <select name="inputType">
        <option value="1">Search All Users</option>
        <option value="firstName">Search by first Name</option>
        <option value="lastName">Search by last Name</option>
    </select>
    <input type="text" name="userInput"><br>
    <input type="submit" value="Submit">
</form>
<br>

</body>
</html>