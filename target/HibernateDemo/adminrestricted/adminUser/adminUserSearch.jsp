<%@ page contentType="text/html;charset=UTF-8" language="java" %>

//will include adminUsers.jsp


<form action="ADMINreceiveUser" method="get">
    <select name="inputType">
        <option value="searchAll">Search All Users</option>
        <option value="searchid">Search by User ID</option>
    </select>
    <input type="text" name="userInput"><br>
    <input type="submit" value="Submit">
</form>
<br>

//upon submitting, search results will show here
//do this by either includes or something