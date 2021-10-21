# Project information:
In this project you can see the level of my skills in JAVA, OOP, SOLID, WEB, JDBC, SQL.
# How to use it:
1. Crate new driver - it's you account (login and password).
2. Login.
3. You can 
- create new car, manufacturer, add manufacturer to car, driver to car, 
- look all drivers, cars and others,
- also you can delete some information
# Technologies and version:
- Java 11.
- MySQL.
- Maven.
- Javax servlet API and Jstl.
- Tomcat 9.0.53 (You can't use Tomcat version 10+).
# To start a project you must have:
1. IDE for Java.
2. MySQL or other DBMS (but you mush correct class ConnectionUtil and your DB).
3. Configuration DB for MySQL:
src/main/resources/init_db.sql - file for creating DB with tables.
4. Configuration connection to DB for: 
src/main/java/mate/util/ConnectionUtil.java - file for configuration.
   private static final String URL = "url DB";
   private static final String USERNAME = "YOUR_USERNAME";
   private static final String PASSWORD = "YOUR_PASSWORD";
Example:
   private static final String URL = "jdbc:mysql://localhost:3306/taxi";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "1234";
5. Run Tomcat.
# Also you can use Heroku
I added all the settings for this:
- system.properties;
- Procfile;
- Plugin into pom.xml;
* You should only deploy in you Heroku profile.
* You can look my Heroku: https://yelinskyi-taxi-service.herokuapp.com/login




