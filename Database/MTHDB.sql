-- Current issues

-- {ISSUE 1} Bools?? {Photo tble}{syntax}

-- {ISSUE 2} Are photos saved by data types or by are they housed somewhere else and referenced by location?? {Photo tble}

-- {ISSUE 3} ApproxamateTime?? {Photo tble}{should this be save or calculated in app}{this function would need to reference google maps api}
		--ApproxamateTime = (TripTime calculated by google maps 'cab' setting) + (30min x eachlocation assosiated with the trip)

-- {ISSUE 4} Foriegn key declaration. {all tables}

-- {ISSUE 5} Admin permitions. {all tables}


CREATE DATABASE MTH;
USE DATABASE MTH;

User(
   User_id INT NOT NULL AUTO_INCREMENT,
   UserName VARCHAR(15) NOT NULL,
   FirstName VARCHAR(20) NOT NULL,
   LastName VARCHAR(20) NOT NULL,
   Email VARCHAR(20) NOT NULL,
   Submission_date DATE,
   PRIMARY KEY ( User_id )
);

Password(
   Password_id INT NOT NULL AUTO_INCREMENT,
   Password VARCHAR(15) NOT NULL,
   PRIMARY KEY ( Password_id )
);

Sponsor(
   Sponsor_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Name VARCHAR(20) NOT NULL,
   WebsiteURL VARCHAR(20) NOT NULL,
   Description VARCHAR(200) NOT NULL,
   PRIMARY KEY ( Sponsor_id )
);

Location(
   Location_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   PRIMARY KEY ( Location_id )
);

Trip(
   Trip_id INT NOT NULL AUTO_INCREMENT,
   Name VARCHAR(20) NOT NULL,
   Description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   ApproxamateTime TIME,			--REFERENCE ISSUES LIST AT TOP {ISSUE 3}
   PRIMARY KEY ( tutorial_id )
);

UserTrip(
   UserTrip_id INT NOT NULL AUTO_INCREMENT,
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   User_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( Trip_id )
);

TripLocation(
   TripLocation_id INT NOT NULL AUTO_INCREMENT,
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Location_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( TripLocation_id )
);

Msgs(
   Msg_id INT NOT NULL AUTO_INCREMENT,
   msg_Content VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( Msg_id )
);

UserMsgs(
   UserMsgs_id INT NOT NULL AUTO_INCREMENT,
   Msg_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   User_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( UserMsgs_id )
);

Photo(
   Photo_id INT NOT NULL AUTO_INCREMENT,
   Name VARCHAR(20) NOT NULL,
   Tag VARCHAR(20) NOT NULL,
   Photo ???????, 				--REFERENCE ISSUES LIST AT TOP {ISSUE 2}
   Description VARCHAR(40),
   Approved BOOL???, 				--REFERENCE ISSUES LIST AT TOP {ISSUE 1}
   Submission_date DATE,
   PRIMARY KEY ( photo_id )
);

UserPhoto(
   UserPhoto_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   User_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( UserPhoto_id )
);

TripPhoto(
   TripPhoto_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( TripPhoto_id )
);
