Feature: Verify Login functionality in Facebook Application.

  Scenario: Verify Login functionality for valid username and invalid password
  
  #Scenario Outline: Verify Login functionality for valid username and invalid password
  
    Given verify the user is on facebook login page.
    
    #When users enters "<username>" and "<password>"
    
    When users enters username and password
    
      #1D Without header
      #| user1    | Test1234 |
      
      #2D Wihtout Header
      #| user1    | Test1234 |
      #| user2    | Test4678 |
      #| user3    | Test1122 |
      #| user4    | Test2233 |
      
      #1D With header
      #| username | user4    |
      #| password | Test2233 |
      
      #2D Wihtout Header
      | username | password |
      | user1    | Test1234 |
      | user2    | Test4678 |
      | user3    | Test1122 |
      | user4    | Test2233 |
      
    And user click the login button
    Then error page is didplayed.

    #Examples: 
    #  | username | password |
    #  | user1    | Test1234 |
    #  | user2    | Test4678 |
    #  | user3    | Test1122 |
    #  | user4    | Test2233 |
