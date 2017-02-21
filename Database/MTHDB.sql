-- Current issues

-- {ISSUE 1} Bools?? {Photo tble}{syntax}

-- {ISSUE 2} Are photos saved by data types or by are they housed somewhere else and referenced by location?? {Photo tble}

-- {ISSUE 3} ApproxamateTime?? {Photo tble}{should this be save or calculated in app}{this function would need to reference google maps api}
		--ApproxamateTime = (TripTime calculated by google maps 'cab' setting) + (30min x eachlocation assosiated with the trip)

-- {ISSUE 4} Foriegn key declaration. {all tables}

-- {ISSUE 5} Admin permitions. {all tables}


CREATE DATABASE MTH;
USE DATABASE MTH;

create table User (
   User_id INT NOT NULL AUTO_INCREMENT,
   UserName VARCHAR(15) NOT NULL,
   FirstName VARCHAR(20) NOT NULL,
   LastName VARCHAR(20) NOT NULL,
   Email VARCHAR(20) NOT NULL,
   Password VARCHAR(15) NOT NULL,
   Submission_date DATE,
   PRIMARY KEY ( User_id )
);


--table to edit roles

CREATE USER 'tomcat'@'localhost' IDENTIFIED BY 'tomcat';

create table user_roles (
User_id         varchar(15) not null,
role_name         varchar(15) not null,
primary key (user_name, role_name)
);

--roles to have 
	--admin
		--(can delete and search users. {LOCK DOWN}
		--(can do full crud for AdminTrips. {LOCK DOWN}
		--(can delete and search user trips. {LOCK DOWN}
		--(can do full crud for Locations.{LOCK DOWN}
		--(can do full crud for Sponsors.{LOCK DOWN}
		--(can do full crud for Msgs.{LOCK DOWN}
		--(full crud on work scedule
	--staff
		--(View work scedule and staffchat {msgs subtag}



GRANT SELECT ON sample.* TO 'tomcat'@'localhost';

insert into users values ('admin', 'admin');
// TODO: Based on the requirements, what other user/s do you need to 
add?

insert into user_roles values ('admin', 'administrator');
// TODO: Based on the requirements, what other role/s do you need to add?


--add the following to server.xml, add into host tag 				--will need to edit all local changes on aws
<Realm className="org.apache.catalina.realm.JDBCRealm"
    driverName="com.mysql.jdbc.Driver"
    connectionURL="jdbc:mysql://localhost:3306/MTH?user=tomcat&amp;password=tomcat"
    userTable="User" userNameCol="userID" userCredCol="user_pass"
    userRoleTable="user_roles" roleNameCol="role_name"/>
    //TODO: Make sure this configuration information is consistent with your database/table details



--done with security


create table Sponsor (
   Sponsor_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Name VARCHAR(20) NOT NULL,
   WebsiteURL VARCHAR(20) NOT NULL,
   Description VARCHAR(200) NOT NULL,
   PRIMARY KEY ( Sponsor_id )
);

create table Location (
   Location_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   PRIMARY KEY ( Location_id )
);

create table AdminTrip (
   AdminTrip_id INT NOT NULL AUTO_INCREMENT,
   Name VARCHAR(20) NOT NULL,
   Description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   ApproxamateTime TIME,			--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( AdminTrip_id )
); 

create table Trip (
   Trip_id INT NOT NULL AUTO_INCREMENT,
   Name VARCHAR(20) NOT NULL,
   Description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   ApproxamateTime TIME,			--REFERENCE ISSUES LIST AT TOP {ISSUE 3}
   PRIMARY KEY ( Trip_id )
);

create table UserTrip (
   UserTrip_id INT NOT NULL AUTO_INCREMENT,
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   User_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( UserTrip_id )
);

create table TripLocation (
   TripLocation_id INT NOT NULL AUTO_INCREMENT,
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Location_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( TripLocation_id )
);

create table Msgs (
   Msgid INT NOT NULL AUTO_INCREMENT,
   User_id INT(20),
   content VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( Msgid )
);

create table AdminMsgs (
   Msgid INT NOT NULL AUTO_INCREMENT,
   User_id INT(20),
   content VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( Msgid )
);

create table Photo (
   Photo_id INT NOT NULL AUTO_INCREMENT,
   Name VARCHAR(20) NOT NULL,
   Tag VARCHAR(20) NOT NULL,
   Photo ???????, 				--REFERENCE ISSUES LIST AT TOP {ISSUE 2}
   Description VARCHAR(40),
   Approved BOOL???, 				--REFERENCE ISSUES LIST AT TOP {ISSUE 1}
   Submission_date DATE,
   PRIMARY KEY ( photo_id )
);

create table UserPhoto (
   UserPhoto_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   User_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( UserPhoto_id )
);

create table TripPhoto (
   TripPhoto_id INT NOT NULL AUTO_INCREMENT,
   Photo_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   Trip_id INT(20),				--REFERENCE ISSUES LIST AT TOP {ISSUE 4}
   PRIMARY KEY ( TripPhoto_id )
);
