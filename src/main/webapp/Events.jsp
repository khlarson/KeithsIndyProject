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
                <li><a href="Sponsor.jsp">Sponsor</a></li>
                <li><a href="Events.jsp">Special Events</a></li>
                <li><a href="#team">Memories</a></li>
                <li><a href="#pricing">Contact Us</a></li>
                <li><a href="#portfolio">Donate</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- end navigation -->

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
                <h2 class="wow bounce">Our Trips</h2>
                <div class="iso-section wow fadeIn" data-wow-delay="0.6s">

                    <!--All trips categories, trip cover photos will be retrieved with db connections-->
                    <div class="iso-box-section">
                        <div class="iso-box-wrapper col4-iso-box">

                            <div class="iso-box graphic photoshop wallpaper col-md-4 col-sm-6 col-xs-12">
                                <div class="portfolio-thumb">
                                    <!--Photo should be recieved from db -->
                                    <img src="images/portfolio-img1.jpg" class="fluid-img" alt="portfolio img">
                                    <div class="portfolio-overlay">
                                        <a href="#" class="fa fa-search"></a>
                                        <a href="#" class="fa fa-link"></a>

                                        <!--trips categories, trip cover photos will be retrieved with db connections-->
                                        <h4>Option 1</h4>
                                        <p>Come Enjoy!... Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonumm.</p>
                                    </div>
                                </div>
                            </div>

                            <div class="iso-box graphic wallpaper col-md-4 col-sm-6 col-xs-12">
                                <div class="portfolio-thumb">

                                    <!--Photo should be recieved from db -->
                                    <img src="images/portfolio-img2.jpg" class="fluid-img" alt="portfolio img">
                                    <div class="portfolio-overlay">
                                        <a href="#" class="fa fa-search"></a>
                                        <a href="#" class="fa fa-link"></a>

                                        <!--trips categories, trip cover photos will be retrieved with db connections-->
                                        <h4>Option 2</h4>
                                        <p>Come Enjoy!... Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonumm.</p>
                                    </div>
                                </div>
                            </div>

                            <div class="iso-box wallpaper col-md-4 col-sm-6 col-xs-12">
                                <div class="portfolio-thumb">
                                    <!--Photo should be recieved from db -->
                                    <img src="images/portfolio-img3.jpg" class="fluid-img" alt="portfolio img">
                                    <div class="portfolio-overlay">
                                        <a href="#" class="fa fa-search"></a>
                                        <a href="#" class="fa fa-link"></a>

                                        <!--trips categories, trip cover photos will be retrieved with db connections-->
                                        <h4>Option 3</h4>
                                        <p>Come Enjoy!... Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonumm.</p>
                                    </div>
                                </div>
                            </div>

                            <div class="iso-box graphic col-md-4 col-sm-6 col-xs-12">
                                <div class="portfolio-thumb">
                                    <img src="images/portfolio-img4.jpg" class="fluid-img" alt="portfolio img">
                                    <div class="portfolio-overlay">
                                        <a href="#" class="fa fa-search"></a>
                                        <a href="#" class="fa fa-link"></a>
                                        <h4>Custom</h4>
                                        <p>Want a custom trip catered to your interests! You're in luck! Check out our lists of approved resturants, bars and other locations to begin planning your trip! </p>
                                    </div>
                                </div>
                            </div>
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
