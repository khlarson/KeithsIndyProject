<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">

		<title>The Mad Town Hopper</title>
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
						<li><a href="InProgress.jsp">Memories</a></li>
						<li><a href="InProgress.jsp">Donate</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- end navigation -->

		<!-- start home -->
		<section id="home" class="text-center">
		  <div class="templatemo_headerimage">
		    <div class="flexslider">
		      <ul class="slides">
		        <li>
	<!-- Image To be received from db -->
		        	<img src="images/slider/h1.jpg" alt="Slide 1">
		        	<div class="slider-caption">
					    <div class="templatemo_homewrapper" style="background-color: grey;">
	<!-- This should have a background color -->
					      <h1 class="wow fadeInDown" data-wow-delay="2000">The Mad Town Hopper</h1>
					      <h2 class="wow fadeInDown" data-wow-delay="2000">
							<!-- This should be grabbed from db, so amir can edit it -->
							<span>Offering free rides to all in the downtown area</span>
						</h2>
						<!-- this should only be displayed when user is not signed in  -->
						<a href="adminrestricted/admin.jsp" class="smoothScroll btn btn-default wow fadeInDown" data-wow-delay="2000">Sign In/Sign Up</a>
							<a href="/AboutUsController" class="smoothScroll btn btn-default wow fadeInDown" data-wow-delay="2000">Continue as Guest</a>
					    </div>
				  	</div>
		        </li>
		        <li>
	<!-- Image To be received from db -->
		        	<img src="images/slider/h3.jpg" alt="Slide 2">
		        	<div class="slider-caption">
					    <div class="templatemo_homewrapper" style="background-color: grey;">
	<!-- This should have a background color -->
					      <h1 class="wow fadeInDown" data-wow-delay="2000">Interested in a catered trip?</h1>
					      <h2 class="wow fadeInDown" data-wow-delay="2000">
							<!-- add hyperlink to custom trips -->
							<span>Choose from one of our great trips or plan a custom one</span>
						</h2>
						<a href="Events.jsp" class="smoothScroll btn btn-default wow fadeInDown" data-wow-delay="2000">Plan a Trip</a>
					    </div>
				  	</div>
		        </li>
				<li>
	<!-- Image To be received from db -->
		        	<img src="images/slider/h4.jpg" alt="Slide 3">
		        	<div class="slider-caption">
					    <div class="templatemo_homewrapper" style="background-color: grey;">
	<!-- This should have a background color -->
					      <h1 class="wow fadeInDown" data-wow-delay="2000">About Us</h1>
						<a href="#about" class="smoothScroll btn btn-default wow fadeInDown" data-wow-delay="2000">Learn About Our Company</a>	
					    </div>
				  	</div>
		        </li>
		      </ul>
		    </div>
		  </div>				
		</section>
		<!-- end home -->
		
		
		<!-- Sponsors should be grabbed from table and displayed in div HERE   -->
		
		
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