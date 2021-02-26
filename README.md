# skyscannerApiTests -Postman 
Test for testing Skyscanner Flight Search API with Postman and running collection using Newman.
## General info
In this test by abstracting low-level commands, and by structuring request formation you will be able to get information about cheapest quotes, considering params like local,city, country, currency, start place , destination place, outbound partial date and optionaly inbound partial date.
## Prerequisites
Log in to Skyscanner Flight Search using url https://rapidapi.com/skyscanner/api/skyscanner-flight-search . After logging in, you will have access to <em>apiKey</em>, <em>x-rapidapi-key</em> and <em>x-rapidapi-host</em>. These need to be supplied if you want to run collection in Postman or using Newman. <br />
For safety reasons, the initial and current values are not specified in the environment, so when you get your <em>apiKey</em>, <em>x-rapidapi-key</em> and <em>x-rapidapi-host</em>, go to environment and replace initial and current values with yours <em>apiKey</em>, <em>x-rapidapi-key</em> and <em>x-rapidapi-host</em>.<br /> You also need to add the <em>apiKey</em> value in the Authorization.
You will make all of these changes in the skyscannerEnvironment.json, after you import environment in Postman.
## Postman installation
Postman is a lightweight tool the interact with Web Services. With Postman you will be able to run this collection, and also you can make new commands and send new requests for this and anothers collections.<br /> <a href ="https://www.postman.com/downloads/ ">Download Postman.</a>
## Newman installation
For Newman installation, first you must be ensure that you have Node.js >= v10. <a href ="https://nodejs.org/en/download/package-manager/">Install Node.js via package manager.</a> <br />
The easiest way to install Newman is using NPM.
For install newman globally on your system, run `$ npm install -g newman`
## Usage
After you export your Postman Collection as a json file from the Postman App, you can run it using Newman with <br />
 `$ newman run skyscannerCollection.json –e skyscannerEnvironmentt.json`
# skyscannerApiTests - Java & Rest Assured
## General info
Tets case for Smoke Test using endpoints to simulate the user journey through the Skyscanner Flight Search API. <br/>Based on the entered parameters, the API returns a response with information about the cheapest quotes.
## Prerequisites
•	<a href ="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">Install Java 11.0.8.</a> <br />
•	<a href ="https://rest-assured.io/">Refer REST Assured</a>
## Executing specs
For now, The test suites can be run directly by your IDE with Run as TESTNG test.
## Note
The test currently contains only one class, it will be upgraded over time.
