Feature: Validate the login Page

  Scenario: Checking user login with given data
    Given User launch the url
    When User enter the credentials using 2D dataTable with header
      | username          | password    | browser |
      | John123           | Pass456     | Chrome  |
      | John123@gmail.com | Password123 | Edge    |
      | Facebook123       | Pass@333    | firefox |
    And User click the login button
    Then validate the outcomes the results
