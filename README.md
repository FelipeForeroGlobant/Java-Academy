# Java-Academy

🧾 Final Thesis work
This is your final thesis to be a certified Glober in Java Web Services.

We need to create a Web Service to allow a company handle a internal messages between employees. Our web service should give support to the following functional requirements :

👤User registration : We should have the following data : username , name, last name, identification number, address, zip code city, state, country

🔐 User login : Web service have to have the ability to login a registerd user to send and receive messages.

📩 Message sending : Web service should allow to send messages to multiple registered users specifiying each recipient as a Primary Receptor (To) , Carbon Copy (CC) or Blind Carbon Copy (BCC). User should be logged to sendand receive messages messages. Messages should have the following data : Subject, Body and Attachments.

📧Message Reception : Web service should allow to receive messages . The user can receive message and catalogue each one with one or more labels.

📩Inbox and Sent : Web service will provide support to query messages in inbox and sent.

📂Label Filtering : Web service must provide tools to filter messages by label. User can add different labels to each message. Each user can create their own personalized Web Services.


Our Web Service should meet the following Non-Functional requirements :

1️⃣RESTFUL : Web service should comply the REST principles.

2️⃣Pagination : Web service must allow pagination for queries.

3️⃣Performance : Web service must respond each in less than 10 milliseconds

4️⃣Use design patterns and good practices : You must use Design patterns learned in this course.

5️⃣Testing : You must reach at 80% of Unit Testing coverage in your solution.


You can use the storage you consider the best to provide support to solve this problem. We prefer to use a Relational Database , but if you consider if a NoSQL database fits to comply requirements it's ok.

Optional Activity

In order to have a more comprehensive picture on how Web Services works in a normal environment, you can Dockerize the solution creating containers in an internal network for DB and Web Service and connect both.

Commit:
Commit your practice code, in stages and review with your Tutor, to guarantee you are rocking!!