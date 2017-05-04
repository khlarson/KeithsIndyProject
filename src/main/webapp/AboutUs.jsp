<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>About Us</title>
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

<!-- start about -->
<div id="about">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6 wow fadeInLeft" data-wow-delay="0.9s">
                <h3>About Mad Town Hopper</h3>
                    <h4>${msg.title}</h4>
                    <p>${msg.content}</p>
                <p>Praesent eu egestas ante, sed eleifend libero. Fusce id nisl vitae lectus posuere feugiat dictum ut purus. Pellentesque eget turpis odio. Suspendisse porttitor sapien eget sem hendrerit, at rutrum tellus accumsan.</p>
            </div>
        </div>
    </div>
</div>
<!-- end about -->

<!-- start team -->
<div id="team">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h2 class="wow bounce">Meet the team</h2>
            </div>
            <c:forEach var="eventTypes" items="${eventTypes}" >
            <div class="col-md-4 col-sm-4 wow fadeIn" data-wow-delay="0.3s">
                <img src=${user.photo} class="img-responsive" alt="team img">
                <h4>${user.role}</h4>
                <h3>${user.firstName}</h3>
                <p>${user.bio}</p>
                <ul class="social-icon text-center">
                    <li><a href="#" class="wow fadeInUp fa fa-facebook" data-wow-delay="2s"></a></li>
                    <li><a href="#" class="wow fadeInDown fa fa-twitter" data-wow-delay="2s"></a></li>
                    <li><a href="#" class="wow fadeIn fa fa-instagram" data-wow-delay="2s"></a></li>
                    <li><a href="#" class="wow fadeInUp fa fa-pinterest" data-wow-delay="2s"></a></li>
                </ul>
            </div>
            </c:forEach>
        </div>
    </div>
</div>
<!-- end team -->

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