<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Create New Event</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords" content="">
    <meta name="description" content="">

    <!-- animate -->
    <link rel="stylesheet" href="css/animate.min.css">
    <!-- bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- font-awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- google font -->
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700,800' rel='stylesheet' type='text/css'>
    <!-- custom -->
    <link rel="stylesheet" href="css/style.css">

</head>
<body data-spy="scroll" data-offset="50" data-target=".navbar-collapse">

<!-- start navigation -->
<div class="navbar navbar-fixed-top navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand"><img src="maps/Capture.PNG" class="img-responsive" alt="logo"></a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="/AboutUsController">About Us</a></li>
                <li><a href="/SponsorController">Sponsor</a></li>
                <li><a href="/EventsController">Catered Events</a></li>
                <li><a href="#team">Memories</a></li>
                <li><a href="#portfolio">Donate</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- end navigation -->

<section class="text-center">
    <div class="templatemo_homewrapper" style="background-color: grey;">
        <br><br><br><br><br>
        <title>Create a New Location</title>
        <form method="post" action="/CreateEvent">
            Event Name:<br>
            <input type="text" name="name"><br>
            Description:<br>
            <input type="text" name="description"><br>
            Type:<br>
            <select name="tag">
                <option value="addfunctionality" style="text-align:center;">addfunctionality</option>
            </select><br>
            Estimated Time:<br>
            <input type="text" name="approxomateTime" placeholder="00:00" style="text-align:center;"><br>
            <c:forEach var="location" items="${locations}" >
                Choose Locations to Include:<br>
                <input type="checkbox" name="location" value="${location}"> ${location.name}<br>
            </c:forEach>
            <INPUT TYPE="SUBMIT" VALUE="Continue and add locations to events">
        </form>
        <br>
    </div>
</section>
<!-- end home -->


<!-- start footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-sm-7">
                <p>Contact Info</p>
            </div>
            <div class="col-md-4 col-sm-5">
                <ul class="social-icon">
                    <li><a href="https://www.facebook.com/HopperRides/" class="fa fa-facebook"></a></li>
                    <li><a href="https://twitter.com/madtownhopper?lang=en" class="fa fa-twitter"></a></li>
                    <li><a href="https://www.instagram.com/hopperrides/" class="fa fa-instagram"></a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>
<!-- end footer -->



<!-- jQuery -->
<script src="js/jquery.js"></script>
<!-- bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- isotope -->
<script src="js/isotope.js"></script>
<!-- images loaded -->
<script src="js/imagesloaded.min.js"></script>
<!-- wow -->
<script src="js/wow.min.js"></script>
<!-- smoothScroll -->
<script src="js/smoothscroll.js"></script>
<!-- jquery flexslider -->
<script src="js/jquery.flexslider.js"></script>
<!-- custom -->
<script src="js/custom.js"></script>

</body>
</html>