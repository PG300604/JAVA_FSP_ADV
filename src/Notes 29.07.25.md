# What do you mean by Web Development?



##### Web development is the concept that encompasses all the activities involved with websites and web applications.

##### 

##### Web development is the umbrella term for conceptualizing, creating, deploying, and operating web applications for the Web.



# Why Java for Web Development



* ##### Java offers higher cross-functionality and portability, as programs written for one platform can run across desktops, mobile devices, and embedded systems.
* ##### Java is a free, simple, object-oriented, distributed programming language that supports multithreading and offers multimedia and network support.
* ##### Being highly popular at the enterprise, embedded, and network levels, Java has a large active user community and support available.
* ##### Java has powerful development tools like Eclipse SDK and NetBeans, which have debugging capabilities and offer an integrated development environment.
* ##### Java is a mature language, therefore more stable and predictable. The Java class Library enables cross-platform development.



# The Java 2 Platform, Enterprise Edition



##### J2EE is a platform-independent, Java-centric environment for developing, building, and deploying Web-based enterprise applications online. The J2EE platform consists of a set of services, APIs, and protocols that provide the functionality for developing multitiered, Web-based applications.



# Enterprise Programming



##### It is the method of developing Enterprise Applications, which help an enterprise or business organisation to manage various business activities.



# Advantages of J2EE



* ##### Platform Independence

##### 

#####     Java can provide a platform-independent programming function evenly throughout the model that can enterprise.

##### 

* ##### Managed Objects

##### 

#####    J2EE provides a managed environment for components. J2EE applications are also container-centric. Due to this property, J2EE components utilize the infrastructure provided by the J2EE servers without the programmers being aware of it.

##### 

* ##### Reusability

##### 

#####    Since Java is an object-oriented programming language hence it provides the mechanism of reuse.

##### 

* ##### Modularity

##### 

#####    J2EE provides the property to modularize the application by breaking it down into different tiers and individual tasks.

##### 

# Client Server Architecture



##### 

## A software application composition can be broken down into 3 fundamental logical layers.

##### 

* ##### Presentation Layer: It is the user interface that is responsible for displaying stuff to the user and collecting data from the user.
* ##### Business Rules Layer works and handles the In this layer the application important processing.
* ##### Data Access Layer. This part of the software is responsible for reading and writing the data from the source that stores information.



## Client



##### A client is a computer that accepts data from the user and sends a request to the server for processing the data.



## Server



##### A server is a computer that accepts the requests coming from the client, processes those requests, and sends the necessary response back to the client. Based on the nature of request and response, a client-server architecture can be classified into the following :

##### Enterprise Architecture Types

##### 

##### Single-Tier Architecture

##### 

##### All three 3 logical application services - the presentation, the business rules, and the data access layers exist in a single computing layer. The client machines are called dumb terminals because they do not have any processing power of their own; they only display what the server wants them to display.



FIG 1.1



##### Advantages of Single-Tier Architecture.

##### 

* ##### Easy to implement.
* ##### Less Costly.

##### 

##### Disadvantages of Single-Tier Architecture.

##### 

* ##### If somehow the server crashes, then the architecture fails and all the data is lost.



##### 

##### 2-Tier Architecture

##### 

##### This is the traditional client-server architecture where the processing load is given to the client, while the server controls the traffic between the application and data. The client machines are replaced with PCs.



FIG 1.2



##### Advantages of 2-Tier Architecture.



* ##### As the Client machines are individual personal computers, they can share some of the load of the server, thus making this architecture faster than the single-tier architecture.



##### Disadvantages of 2-Tier Architecture.

##### 

* ##### If somehow the server crashes, then the architecture fails and all the data is lost.



##### 3-Tier Architecture



##### In a three-tier system, the server part is split into 2:



1. ##### Web Server 2. Database Server.

##### 

##### The Web server is responsible for handling requests and responses, and the database server is responsible for storing and manipulating the data stored in the database.



FIG 1.3



##### Advantages of 3-Tier Architecture.



* ##### This architecture is much more secure as compared to previous two architectures.
* ##### Here, the chance of data loss is less than in the previous two architectures.



##### Disadvantages of 3-Tier Architecture.

##### 

* ##### It is much more costly than the previous two architectures.
* ##### There is still a chance of data loss.





##### n-Tier Architecture



##### In n-Tier architecture, there are several parallel servers, which are also termed proxy servers, connected.



##### Advantages of n-Tier Architecture.



* ##### Here, the chance of Data loss in getting crashed is almost nil.



##### Disadvantages of 3-Tier Architecture.

* ##### Costly.
* ##### Complex



# J2EE Architecture



FIG 1.5



##### J2EE TOPICS

##### 

##### 1\. J2EE BASICS \[CLIENT SERVER ARCHITECTURE]

##### 

##### (CLIENT SIDE)

##### 

##### 2\. HTML BASICS

##### 

##### 3\. JAVASCRIPT \[CLIENT SIDE VALIDATION]

##### 

##### (SERVER SIDE)

##### 

##### 4\. JAVA DATABASE CONNECTIVITY

##### 

##### 5\. SERVLET

##### 

##### 6\. SESSION MANAGEMENT

##### 

##### 7\. JAVA SERVER PAGES

##### 

##### 8\. MVC USING BEAN

##### 

##### 9\. FRAMEWORK CONCEPT

##### 

##### 10\. PROJECT AND DOCUMENTATION





# HTML



##### HTML is called Hyper Text because it follows the concept of hyperlinking, using which we can switch from one page to another.



EX- hprog1.html



##### Regarding Header H1-H7, where H1 is the largest and H7 is the smallest.



##### \&nbsp Stands for non-breaking space.



# List



##### In HTML, there are 3 types of lists available.

* ##### Unordered List
* ##### Ordered List
* ##### Nested List



##### In HTML, there are 3 types of lists available 

##### ⦁	Ordered List

##### ⦁	Unordered List

##### ⦁	Nested List

##### 

##### The type attribute of the Unordered List can take 3 Values:

##### ⦁	Square

##### ⦁	Disc

##### ⦁	Circle



##### The type attribute of the Ordered List can take 5 Values:



* ##### Number
* ##### Roman Capital
* ##### Roman Small
* ##### Alphabets Capital
* ##### Alphabets Small



##### The start command is used to start a loop from the number given (it will always be given in numbers)



# Tables in HTML



##### In HTML, a Table is used to design and align content on a webpage. In HTML, is table is created using a <table> tag. The rows of a Table are represented using the <tr> tag, and the columns in an HTML table are represented in the <td> tag.



# HyperLink



##### A hyperlink is the mechanism by which we can switch between one webpage to another. For Hyperlinking, we require an anchor tag(<A>).



# Frame



##### A frame is a mechanism using which we can view multiple webpages on a single webpage. A frame is created using the <frameset> tag. This tag does not have a body tag.



# Nested Frame



##### In HTML, we can have one frame inside another frame.



# Form



##### A form in HTML is used to accept data from the user and send a request to the server. In HTML, a form is created using a <form> tag. The <form> tab contains two main attributes :

* ##### Method
* ##### Action



##### The method attribute of the form is used to determine how a request is to be sent from the client to the server. The method attribute can take two values.

* ##### Get
* ##### Post



##### The action attribute is responsible for determining which code on the server side will handle the request.



FIG 1.6

