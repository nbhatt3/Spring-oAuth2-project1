# Spring-oAuth2-project1
A simple OAuth2 project which sends authentication request to Github for a user, gets the token from Github and uses in subsequent request for accessing resource on Github.


Using: http://locahost:8080/
A request is sent to Github from this Spring boot application (which has been registered with Github). 
The spring boot application request the access of Github for user.
Prior to this, for this user a clientId and Client Secret has been obtained for spring-boot application.
This information has been set in application.yml file.

Basically, the spring boot application(Name: spring-oAuth-project) has been registered as one of the app,
which can be granted access based on token.
Token will be created by Github (Authentication server) and then issued to spring boot application.
Spring boot application will use it in its header each time a request is sent to Github (by springboot application).
