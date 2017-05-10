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
   user_id INT NOT NULL AUTO_INCREMENT,
   userName VARCHAR(15) NOT NULL,
   firstName VARCHAR(20) NOT NULL,
   lastName VARCHAR(20) NOT NULL,
   email VARCHAR(40) NOT NULL,
   password VARCHAR(15) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( user_id )
);

CREATE USER 'tomcat'@'localhost' IDENTIFIED BY 'tomcat';

create table user_roles (
user_id         varchar(15) not null,
role_name         varchar(15) not null,
primary key (user_id, role_name)
);

GRANT SELECT ON sample.* TO 'tomcat'@'localhost';

insert into users values ('admin', 'admin');
// TODO: Based on the requirements, what other user/s do you need to 
add?

insert into Team values ('Keith Larson', 'Web Developer', 'I enjoy long walks on the beach, code that works on the first compile, beer and breakfast food','test1.jpeg');
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
   sponsor_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   website VARCHAR(100) NOT NULL,
   twitter VARCHAR(100) NOT NULL,
   facebook VARCHAR(100) NOT NULL,
   description VARCHAR(200) NOT NULL,
   photo VARCHAR(25) NOT NULL,
   PRIMARY KEY ( sponsor_id )
);

//INSERT INTO Sponsor (name, website, twitter, facebook, description, photo) VALUES('Ians Pizza', 'https://ianspizza.com/', 'https://twitter.com/IansMadison?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor', 'https://www.facebook.com/IansPizzaMadison/', 'Ians is a pizza by the slice joint who pays amir money', '');

create table Location (
   location_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   website VARCHAR(20) NOT NULL,
   address VARCHAR(100) NOT NULL,
   PRIMARY KEY ( location_id )
);


create table Event (
   event_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   description VARCHAR(200) NOT NULL,
   tag VARCHAR(20) NOT NULL,
   approxomateTime VARCHAR(20) NOT NULL,
   adminCreated VARCHAR(1) NOT NULL,
   adminApproved VARCHAR(1) NOT NULL,
   PRIMARY KEY ( event_id )
);


create table Event_Location (
   EventLocation_id INT NOT NULL AUTO_INCREMENT,
   event_id INT(20),
   location_id INT(20),
   PRIMARY KEY ( EventLocation_id )
);

CREATE TABLE Msgs (
  msg_id INT NOT NULL AUTO_INCREMENT,
  user_id INT(20),
  title VARCHAR(30) NOT NULL,
  content VARCHAR(400) NOT NULL,
  tag VARCHAR(20) NOT NULL,
  date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY ( msg_id )
);

ALTER TABLE Location
MODIFY name VARCHAR(50) NOT NULL;


ALTER TABLE Event
ADD map VARCHAR(100) NOT NULL;

ALTER TABLE Location
ADD name VARCHAR(50) NOT NULL;

ALTER TABLE Team
ADD photo VARCHAR(50) NOT NULL;

//INSERT INTO Msgs (user_id, title, content, tag) VALUES('1', 'How it all started...', 'This business began with a simple idea; people should be able to get around madison without worrying about the price of....', 'AboutUs1');
//INSERT INTO Msgs (user_id, title, content, tag) VALUES('1', 'Why advertise with us?', 'We at the Hopper are able offer our services in large part due to our sponsors. Now you may ask what our sponsors get in return...', 'Sponsor1');


insert into Team (name, title, bio, photo) values ('TestName', 'Driver', 'Bla bla bla, I drive a cart and do other stuff too','test2.jpg');
create table Team (
   team_id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(40) NOT NULL,
   title VARCHAR(40) NOT NULL,
   bio VARCHAR(200) NOT NULL,
   PRIMARY KEY ( team_id )
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
   photo_id INT NOT NULL AUTO_INCREMENT,
   tag VARCHAR(20) NOT NULL,
   photo VARCHAR(20) NOT NULL,
   description VARCHAR(40),
   approved VARCHAR(1),
   submission_date DATE,
   PRIMARY KEY ( photo_id )
);

