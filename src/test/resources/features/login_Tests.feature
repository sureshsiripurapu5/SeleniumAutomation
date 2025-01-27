Feature: Login Tests
  @Lt1
  Scenario: Verify successful login
    Given User on login page
    When User enter "performance_glitch_user" and "secret_sauce"
    And User click on submit
    Then User verify products page
    And User verify single product

  @Lt2
  Scenario: Verify successful login with Data in row
    Given User on login page
    When User enter login credentials using below row
      | standard_user | secret_sauce | 6309092819 | siripurapusuresh5@gmail.com |
    And User click on submit
    Then User verify products page


  @Lt3
  Scenario:Verify Successful login with row as header
    Given User on login page
    When User enter login credentials using row header
      | username      | password     | phone      | email                       |
      | standard_user | secret_sauce | 6309092819 | siripurapusuresh5@gmail.com |

    And User click on submit
    Then User verify products page


