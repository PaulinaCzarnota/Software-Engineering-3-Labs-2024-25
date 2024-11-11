This repository contains a collection of labs completed for the Software Engineering 3 module during my third year of Computer Science at TU Dublin. 
 
# Lab Summaries

### Lab 1: Introduction to Rational Software Architect Designer (RSA)

In this lab, I focused on creating a Requirements Model using Rational Software Architect (RSA). The objectives included:

- **Developing a Use Case Diagram**: I designed a Use Case Diagram for a Restaurant Booking Management system, identifying key functionalities and user interactions.
- **Identifying Actors and Use Cases**: I listed the main Actors (e.g., customers, staff) and defined Use Cases (e.g., book a table, view bookings) that capture the essential requirements of the system.
- **Setting Up RSA**: I started RSA and selected the appropriate workspace, ensuring that I was using the Modelling perspective to access the relevant tools for diagram creation.

This foundational work laid the groundwork for further analysis and design in subsequent labs, emphasizing the importance of clear requirements in software development.

### Lab 2: Sequence Diagrams and Code Generation in RSA

In the second lab, I expanded on my initial requirements model by introducing sequence diagrams. Key tasks included:

- **Illustrating Interactions**: I developed sequence diagrams that depicted how various objects within the Restaurant Booking Management system interact to complete specific use cases. This helped in visualizing the flow of messages between objects.
- **Refining the Object Model**: As I created the sequence diagrams, I refined my object model by defining new classes and associations, ensuring a robust representation of the system's architecture.
- **Creating a Collaboration**: I added a Collaboration for the "DisplayBookings" use case, which outlined the interaction process between Actors and the system components involved in this function.

This lab demonstrated how RSA automatically updates the object model based on my diagram modifications, enhancing my understanding of dynamic interactions and object-oriented design principles.

### Lab 3: Class and Sequence Diagrams with Model Implementation

In the third lab, I created a UML project for a Letting Company management system. The objectives were to:

- **Developing a Use Case Diagram**: I constructed a Use Case Diagram that identified key functionalities such as calculating monthly rent, managing tenants, and property listings.
- **Creating an Object Model**: I defined the class relationships and attributes, ensuring the model accurately reflected the system's requirements. This included identifying the relevant classes such as Property, Apartment, and Manager.
- **Producing a Collaboration and Sequence Diagram**: I added a Collaboration to demonstrate how the identified objects would work together to fulfill the "Compute Total Monthly Rent" use case. The Sequence Diagram illustrated the messages exchanged between objects, adhering to the structure defined in the class diagram.

In this lab, I emphasized the Principle of Least Knowledge, ensuring that each class only interacts with the necessary components, which is vital for maintaining system modularity and reducing complexity.

### Lab 4: DAO Pattern Implementation using Eclipse

The final lab involved transitioning from RSA to Eclipse, focusing on implementing the Data Access Object (DAO) pattern. Key aspects included:

- **Setting Up a Java Project**: I created a new Java project called SE3_JDBC_Example in Eclipse, ensuring the project was structured to accommodate JDBC operations for database interaction.
- **Integrating MySQL**: I downloaded the MySQL JDBC Connector and configured it within the project, allowing for seamless communication between my Java application and the MySQL database.
- **Implementing the DAO Pattern**: I developed DAO classes to abstract the data access logic from the business logic. This involved creating interfaces and concrete classes for managing database operations, such as inserting, updating, and retrieving data related to properties and tenants.

This lab provided valuable hands-on experience in Java and database management, reinforcing the importance of data persistence in software applications. 

### Lab 5: Setting up Dynamic Web Project with Database Connections

In this lab, I focused on setting up a Dynamic Web Project in Eclipse to integrate a Java web application with a MySQL database using JDBC. The key tasks included:

- **Setting up the Project**: I created a Dynamic Web Project in Eclipse and configured it for Java EE, ensuring compatibility with MySQL and JDBC.
- **Database Integration**: I set up a connection to the MySQL database by configuring a connection string and importing the necessary JDBC libraries.
- **DAO Pattern Implementation**: I implemented the Data Access Object (DAO) pattern to handle the database operations for user management. This pattern helped separate database interaction from the rest of the application logic, ensuring scalability and maintainability.
- **Creating User Management Features**: I created functionalities to interact with user data in the database, such as logging in and fetching user information.

This lab helped me understand how to integrate database-driven functionality into a Java web application using the DAO pattern and JDBC.

### Lab 6: Implementing User Management Patterns in Java Web Application

Lab 6 extended the work done in Lab 5 by implementing additional user management features in the Java web application. The key objectives were:

- **Listing Users**: I created a feature to list all users from the database. This involved adding a new `ListUsersCommand` class to retrieve all users via the `UserService` and displaying them in a JSP page using a `forEach` loop to iterate over the list.
- **Viewing User Profile**: I implemented a View User Profile feature, where users could click a button to view their own profile. This used session data to fetch the current user's information and display it in a profile view.
- **Session Management**: Throughout the lab, I ensured that the current user session was properly managed, allowing for personalized views based on the logged-in user’s information.

This lab provided experience in implementing MVC (Model-View-Controller) design patterns in Java web applications and working with JSPs to dynamically generate web pages based on user input and session data.
