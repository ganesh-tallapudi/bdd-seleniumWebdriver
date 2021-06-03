Feature: To be able to find the pets availability by status

Scenario: To validate the response when Swagger is up
    Given The base URL is set
    When I send GET request to "/pet/findByStatus"
    Then Valid response is received


Scenario: To validate the response when Swagger is down
    Given The swagger service is down
    When I read the Json response file
    Then Valid resonse is received