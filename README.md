# skyscannerApiTests
Test for testing Skyscanner Flight Search API with Postman and running collection using Newman.
## General info
In this test by abstracting low-level commands, and by structuring request formation you will be able to get information about cheapest quotes, considering params like local,city, country, currency, start place , destination place, outbound partial date and optionaly inbound partial date.
## Prerequisites
Log in to Skyscanner Flight Search using url https://rapidapi.com/skyscanner/api/skyscanner-flight-search . After logging in, you will have access to apiKey, x-rapidapi-key and x-rapidapi-host. These need to be supplied if you want to run collection in Postman or using Newman. 
For safety reasons, the initial and current values are not specified in the environment, so when you get your apiKey, x-rapidapi-key and x-rapidapi-host, go to environment and replace initial and current values with yours apiKey, x-rapidapi-key and x-rapidapi-host. You also need to add the apiKey value in the Authorization.
You will make all of these changes in the skyscannerEnvironment.json, after you import environment in Postman.
## Postman installation
Postman is a lightweight tool the interact with Web Services. With Postman you will be able to run this collection, and also you can make new commands and send new requests for this and anothers collections.
## Newman installation
For Newman installation, first you must be ensure that you have Node.js >= v10. Install Node.js via package manager.
The easiest way to install Newman is using NPM.
For install newman globally on your system, run $ npm install -g newman
## Usage
After you export your Postman Collection as a json file from the Postman App, you can run it using Newman with
'$ newman run skyscannerCollection.json –e skyscannerEnvironmentt.json'
