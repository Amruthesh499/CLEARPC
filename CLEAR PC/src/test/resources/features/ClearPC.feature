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
    Then Validate Search asset is displaying correctly
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    
    
    #@T3AsperaDownload_ClearPC
    #Scenario: Search_Autosuggestion_Feature
    #Given Open Browser and naviagate to the ClearPC portal
    #When Enter the valid user name in username input field
    #Then Click on Continue button of ClearPC
    #And Enter the Valid password in the Password input field
    #And Click on Login button of ClearPC
    #And Click on Search icon
    #And Enter text value in Search field
    #And Search for asset
    #And Select Download Operation from dropdown
    #Then Validate Downloaded filename is correct or not
    #Then Click on Logout button from ClearPC
    #Then Quit the browser for ClearPC
    
    @T4Streaming_ClearPC
    Scenario: Streaming_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter text value in Search field
    And Search for the asset
    And Validate Advance player functionality
    And Validate Information player functionality
    And Validate Editor player functionality
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    @T5HTTPDownload_ClearPC
    Scenario: Streaming_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter test file value in Search field
    And Search for test asset
    And Select Download Operation without aspera from dropdown
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    @T6AddandEditFolder_ClearPC
    Scenario: AddandEditFolder_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate to Tenant Project Folder
    And Click on Add Folder icon
    And Enter Title in Add Folder pop up
    And Validate Folder is Created sucessfully
    And Validate Newly created folder is searchable
    And Validate Newly created folder is editable
    And Validate edited folder is searchable
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    @T7Folder_management_ClearPC
    Scenario: HTTPUpload_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder
    And Right Click on rename and update the name 
    And Right click on the asset and Copy the file to other location
    And Right click on the asset and Move the file and paste to other location
    And  Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
    @T8HTTPUpload_ClearPC
    Scenario: HTTPUpload_Feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder
    And Click on Upload button
    And Click on IBM Aspera Alert button
    And Click on browse link
    And Select File and Click Open button
    And Validate fileupload is initated
    And Validate File transfered is completed
    And Validate File entry is dispalying in notification tab
    And Validate File Upload Status is Completed
    And Validate Newly Uploaded file is Streaming in Preview panel
    And  Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
    
     