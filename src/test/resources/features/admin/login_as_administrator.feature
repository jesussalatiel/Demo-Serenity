Feature: Login as Administrator

  Scenario Outline: Login into the system
    Given Administrator is admin page
    When he login with credentials "<user>" and "<password>"
    Then he verify ""

  Examples:
    |user|password|
    |mhladmin@yopmail.com|Done@12345|