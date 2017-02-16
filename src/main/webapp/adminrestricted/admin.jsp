<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>

//should show along the left hand side
//upon click, the following pages will load on the right side of the screen
<ul>
    <li><a href="adminUser/adminUsers.jsp">Users</a></li>
    <li><a href="adminSponsor/adminSponsors.jsp">Sponsors</a></li>
    <li><a href="adminTrip/adminTrips.jsp">Trips</a></li>
    <li><a href="adminDesign/adminDesign.jsp">Website Design</a></li>
    <li><a href="adminTrip/adminUserTripSearch.jsp">Event Requests</a></li>
//Event Requests should show bold when request is in the last 24h
</ul>

</body>
</html>