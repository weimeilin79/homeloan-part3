Home Loan Project on Blueprint (OSGi)
=========================================

This is a follow up demo from previous demo, 
https://github.com/weimeilin79/homeloan-part2

The story behind the home loan demo is we have a system, that takes in XML files from different vendor's home loan application, they will place their customer input into 2 different XML files, one with it's customer data, the other with their housing details. Both files will be place into same folder either by FTP or Batch generated overnight.

First demo was to take in and process the information, first we need to separate the 2 kinds of files, because they are handled differently. And appraised the value of the house before sending it to a messaging broker.

Second demo,  was about processing the customer data, by reading the xml file and store it into a Postgres Database.

Third demo, we were added value to the house by the number of surrounding schools to the house. we referenced Google App Engine (Google Geocoding API to get the co-ordinate from Address, then use Google Places API to get number of surrounding schools) and then updated the new appraised value into   house table in Postgres Database.

In this demo, the vendors are asking for an service, that provides all the data with the updated appraised house value back to them. And they are requesting if the information can be provided through a Restful Web service. It's a piece of cake for JBoss Fuse developer to expose an service via Web Service, we simply setup and configure the endpoints. 

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:org.blogdemo/homeloan/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
