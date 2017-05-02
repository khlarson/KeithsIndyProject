<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Events</title>
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
            <a href="#" class="navbar-brand"><img src="images/hopperLogo1.png" class="img-responsive" alt="logo"></a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="/AboutUsController">About Us</a></li>
                <li><a href="/SponsorController">Sponsor</a></li>
                <li><a href="/EventsController">Catered Events</a></li>
                <li><a href="#team">Memories</a></li>
                <li><a href="#pricing">Contact Us</a></li>
                <li><a href="#portfolio">Donate</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- end navigation -->
<br><br><br><br>
<p>Must take be redirected through get event controller passing the eventID.<br>

    Need to access
    Will need to access event description from ReceiveEvent Controller,<br>
    locations with matching EventId from ReceiveLocation Controller,<br>
    photos with matching EventId from ReceiveLocation Controller,<br>
    bookedEventTimes from a bookedEventTimesController<br><br><br>

    page also needs to calculate trip time, this can be done utilizing google maps api with locations as parameters<br><br><br>

    Booking Request Form that will only be showed to logged in users<br><br><br>


    Need to return to db from form<br>
    Booking information<br>
    -UserID (will be taken from the session)<br>
    -DateTime<br>
    -EventID<br><br><br>


    All new events scheduled will be sent to admin notification's for review</p><br>
<!-- start google map -->
<div class="google_map">
    <div id="map-canvas"></div>
</div>
<!-- end google map -->

<!-- start portfolio -->
<div id="portfolio">
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <h2 class="wow bounce">Event Categories</h2>
                <div class="iso-section wow fadeIn" data-wow-delay="0.6s">

                    <!--All trips categories, trip cover photos will be retrieved with db connections-->
                    <div class="iso-box-section">
                        <div class="iso-box-wrapper col4-iso-box">


                            <c:forEach var="event" items="${event}" >
                                <div class="iso-box graphic photoshop wallpaper col-md-4 col-sm-6 col-xs-12">
                                    <div class="portfolio-thumb">
                                        <!--Photo should be recieved from db -->

                                        <img src="images/portfolio-img1.jpg" class="fluid-img" alt="portfolio img">
                                        <div class="portfolio-overlay">
                                            <!--when user clicks, must also pass the event ID -->
                                            <a href="ScheduleEvents.jsp">LearnMore/Schedule</a>
                                            <h4>${event.category}</h4>
                                            <p>${event.description}</p>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>






                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- end portfolio -->

<!-- start google map -->
<div class="google_map">
    <div id="map-canvas"></div>
</div>
<!-- end google map -->





<!-- start footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-sm-7">
                <p>Copyright &copy; 2016 Solution Company</p>
                <small>Designed by <a rel="nofollow" href="http://www.tooplate.com" target="_parent">Tooplate</a></small>
            </div>
            <div class="col-md-4 col-sm-5">
                <ul class="social-icon">
                    <li><a href="#" class="fa fa-facebook"></a></li>
                    <li><a href="#" class="fa fa-twitter"></a></li>
                    <li><a href="#" class="fa fa-instagram"></a></li>
                    <li><a href="#" class="fa fa-pinterest"></a></li>
                    <li><a href="#" class="fa fa-google"></a></li>
                    <li><a href="#" class="fa fa-github"></a></li>
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