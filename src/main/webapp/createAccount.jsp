<%@include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
<div>
    //include a call to the proper msg here
    ${msgs.msgid}
</div>

<div>
<h2>Create an Acount: </h2>
    <form action="CreateUser" method="get">
        <input type="text" name="userName"><br>
        <input type="text" name="firstName"><br>
        <input type="text" name="lastName"><br>
        <input type="text" name="email"><br>
        <input type="text" name="password"><br>
        <input type="text" name="passwordConfirmed"><br>
        <input type="submit" value="Submit">
    </form>
</div>

</body>
