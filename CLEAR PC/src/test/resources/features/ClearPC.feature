Feature: ClearPC_Features
  

  @T1Login_Logout_ClearPC
  Scenario: Login_Logout_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    
    @T2Search_Autosuggestion_ClearPC
    Scenario: Search_Autosuggestion_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter text value in Search field
    And Search for asset
    And Select Download Operation from dropdown
    Then Validate Downloaded filename is correct or not
    #Then Click on Logout button from ClearPC
    #Then Quit the browser for ClearPC
    
    @T3Streaming_ClearPC
    Scenario: Streaming_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter text value in Search field
    And Search for the asset
    And Validate player functionality