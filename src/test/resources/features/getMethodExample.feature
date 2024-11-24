@api
Feature: This feature is to test the get method
Scenario: This is to validate the API get request.

Given the url is ready
When i do a get request on the url
Then the status code is "200"
And  the response shhould have '"id": 1'

Scenario: This is to validate the name on the response.

Given the url is ready
When i do a get request on the url
Then the status code is "200"
And  the response shhould have '"name":'