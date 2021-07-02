# JavaLearnings

The purpose of this exercice, is to create a microservice architecture. Based on JSON data available on : https://jsonplaceholder.typicode.com 

I created first 2 MySql Database on a personnal shared server. For each database, there is one table for one microservice.

The User Microservice will be the client entity for the discovery. Eureka (the service discovery), will register 2 instances of PostApplication in different ports => the PostApplication will be server entity.

![Diagram](https://user-images.githubusercontent.com/18294191/124296260-086f8d00-db5a-11eb-8113-bb8aa57c3b20.png)

I let you have fun with this project. You have to setup the Eureka project first, before lunch different instances of Post and User Application. 

Happy to share ! :smile:
