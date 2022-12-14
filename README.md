# :blue_book: UA :ledger: 🤍 Volunteer 🤍 Taxi 🚕

## Project description  :octocat: :
This web-app allows you to create manufacturers, cars and drivers and store them in DB.

## FEATURES 💡 :
* Registration 📝
* Authentication 🔒
* Create, update or remove cars/manufacturers/drivers 🛢️
* Display list off all models 📃

## PROJECT STRUCTURE 📚 :
Project use 3-tier Architecture:
* Controller layer - gives user control under web-application (depends on his role)
* Service layer - holds all business logic.
* DAO layer - is responsible for communicating with the database by using CRUD methods.

## TECHNOLOGIES 🧬 : 
* Java 17
* MySQL
* JDBC
* Tomcat
* Maven
* JSP

## INSTRUCTIONS FOR LAUNCHING THE PROJECT 🗺️ :
1. Fork my repository
2. git clone <your link>
3. Edit ConnectionUtil.class 

| set the necessary parameters:                        |
|------------------------------------------------------|
| `private static final String URL = "URL";`           |
| `private static final String USERNAME = "USERNAME";` |
| `private static final String PASSWORD = "PASSWORD";` |

4. Create the necessary tables in your database using the file init_db.sql
5. Install Tomcat
6. Add Tomcat server to configuration
7. Run project



    
