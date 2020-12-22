Feature: Create User


  Scenario: Create User
    Then Open "sign-up" page
    Then Click "Start Learning" button
    Then Input email
    Then Input First Name
    Then Input Last Name
    Then Input password
    Then Click "Start Learning" button span
    Then Content is "Spread the Word About Grinfer and Get Rewarded" visible

    Then Click avatar button
    Then Click "Settings" button li

    Then Verify First Name
    Then Verify Last Name


