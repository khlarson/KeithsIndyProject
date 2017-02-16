<%@ page contentType="text/html;charset=UTF-8" language="java" %>

//will include adminUsers.jsp


<form action="ADMINreceiveUser" method="get">
    <select name="inputType">
        <option value="1">Search All Users</option>
        <option value="firstName">Search by first Name</option>
        <option value="lastName">Search by last Name</option>
    </select>
    <input type="text" name="userInput"><br>
    <input type="submit" value="Submit">
</form>
<br>

//upon submitting, search results will show here
//do this by either includes or something
