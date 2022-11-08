@Create_Order
Feature: Register new Test Kit

  Background: Create an order
    Given User is "<consumer_page>"
    When Click on "Shop"
    Then Add to cart the "<test_kit>"
    When Click on "Proceed to checkout"
    Then Enter "<first_name>"
    And Enter "<last_name>"
    And Enter "<street_address>"
    And Enter "<town_city>"
    And Select "<state>"
    And Enter "<zip_code>"
    And Enter "<phone>"
    And Enter "<email>"
    And Enter "<card_number>"
    And Enter "<expiration>"
    And Enter "<cvc>"
    Then Select "I have read and agree to the website terms and conditions"
    And Select "I have read and agree with Testing Consent"
    When Click on "Place Order"

  Scenario Outline: Login into the system
    Given Administrator is admin page
    When he login with credentials "<user>" and "<password>"
    Then he verify ""

    Examples:
    |consumer_page|test_kit|first_name|last_name|street_address|town_city|state|zip_code|phone|email|card_number|expiration|cvc|
    |https://myhomelabs1dev.wpengine.com/|Women’s Wellness Test|User|Testing|10709 BARKLEY ST #A (From A To B Both of Odd and Even)|SPRINT PKWY , LEAWOOD, KS|Kansas|66211|(762) 716-2121|random_email|4242 4242 4242 4242|03 / 42|234|