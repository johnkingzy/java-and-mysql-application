# Java and MySQL Task
Execute SQL insertions and queries using Java, Screenshots for each query outputs can be found in the `screenshots` folder with corresponding filename as suffixed below.

 ### Tasks.
 - Create movie table using SQL. - CreateTable.java
 - Create/Insert rows for all movies in the image below. - CreateDatabaseEntries.java
 - Get a list of all movies with their name, genre and year of released. - QueryResults3.java
 - Get a list of all movies that was released after 2014. - QueryResults4.java
 - Get a list of all movies that starts with "Star". - QueryResults5.java
 - Get a list of all highly rated movies with imdb rating above 7. - QueryResults6.java
 - Get a list of all movies that was released between 1990 and 1999. - QueryResults7.java
 - Get a list of all movies sorted with their name in Ascending order. - QueryResults8.java
 - Get a list of all movies that are 2nd or 3rd edition of the same movie title. - QueryResults9.java

 ### Overview

 Java provides JDBC (Java DataBase Connectivity) as a part of the Java SDK (Software Development Kit). Using this API, it is very easy to connect to a relational database and perform common operations such as querying, inserting, updating, and deleting records.

While the core JDBC API is included in java, connecting to a particular database such as MySQL or SQL Server requires an additional component known as the database driver. This database driver is a software component which translates the core JDBC calls into a format understood by that database.
 
To connect Java application with the MySQL database, we need to know the following informations for the mysql database:

Driver class: The driver class for the mysql database is com.mysql.jdbc.Driver.

Connection URL: The connection URL for the mysql database is jdbc:mysql://localhost:3306 movies where jdbc is the API, mysql is the database, localhost is the server name on which mysql is running, we may also use IP address, 3306 is the port number and sonoo is the database name. We may use any database, in such case, we need to replace the `movies` with our database name.

Username: The default username for the mysql database is root. You can change this to match your MySQL username 

Password: It is the password given by the user at the time of installing the mysql database. Yu can change this to match your MySQL password

### How to run

- Clone repository using `git clone https://github.com/johnkingzy/java-and-mysql-application.git`.

- Make sure to change the database credentials to match your config in any of the file to see the outputs.

- Run run a specific file using `javac [filename] && java -cp ./mysql-connector-java-8.0.16.jar: [classname]`. As you can see, we manually set the classpath in the command, just go ahead and specify the filename with `.java` and the classname

e.g
```bash
javac CreateDatabaseEntries.java && java -cp ./mysql-connector-java-8.0.16.jar: CreateDatabaseEntrie s
```

### Resources
- [JDBC Tutorial](https://www.tutorialspoint.com/jdbc/index.htm)
- [JAVA Database Tutorial with JDBC with MySql Complete Course](https://www.youtube.com/watch?v=379qkZTibZA)