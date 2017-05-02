<%@include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
<div>
    //must be declared in servlet
    ${msgs.msgid}
</div>

<div>
<h2>Create an Account: </h2>
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
