<%@ page contentType="text/html;charset=UTF-8" language="java" %>

//will include adminTrips.jsp


<form action="searchTrips" method="get">
    <select name="inputType">
        <option value="1">View All Users</option>
        <option value="tag">Search by Type</option>
        <option value="name">Search by Name</option>
    </select>
    <input type="text" name="userInput"><br>
    <input type="submit" value="Submit">
</form>
<br>

//upon submitting, search results will show here
//do this by either includes or something
