# new feature
# Tags: optional

Feature: User Login on account

  @UserLoginSuccessful
  Scenario Outline: user can log in account
    Given the user has a valid account
    When the clicks on sign in
      And enters email "<Email>"
      And enters password "<PassWord>"
      And clicks sign in
    Then the user is successfully logged in "MY ACCOUNT"
    Examples:
    |Email                |PassWord|
    |pruebaQE10@example.com|Mal1234 |