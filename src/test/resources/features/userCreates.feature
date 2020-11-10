# new feature
# Tags: optional

Feature: User Creates an account

  @UserCreatesSuccessful
 Scenario Outline: User can create an account
    Given The user is on Homepage
    When the user clicks on Sign in
      And user enters email "<Email>"
      And User Clicks create an account
      And User fills sign up form "<Gender>", "<Firstname>", "<Lastname>", "<Password>", "<DateofBirth>", "<Newsletter>", "<Partners>", "<Company>", "<Address>", "<AddressII>", "<City>", "<State>", "<PostalCode>", "<Country>", "<AdditInformation>", "<HomePhone>", "<MobilePhone>", "<AddressAlias>"
      And user clicks register
    Then the user is taken my account page "MY ACCOUNT"
    Examples:
    |Email                |Gender|Firstname      |Lastname      |Password|DateofBirth    |Newsletter|Partners|Company |Address            |AddressII|City    |State |PostalCode|Country      |AdditInformation|HomePhone|MobilePhone|AddressAlias          |
    |pruebaQE40@example.com|Mrs.  |Maria Alejandra|Sierra Carmona|Mal1234 |2-February-1991|yes       |yes     |RealPage|Calle 66 sur #43c45|Ninguna  |Sabaneta|Alaska|99501     |United States|Ninguna         |2806754  |3006312895 |parque los 4 elementos|

