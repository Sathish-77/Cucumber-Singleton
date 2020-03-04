Feature: Verifying adactin details

  Scenario Outline: Verifying login details with invalid credentials
    Given User is on adactin page
    When User enters "<userName>" and "<password>"
    And User should click the login button
    And User should select the  "<location>","<hotels>","<roomType>","<numberOfRooms>"
    
    And User should enter the check in   "<checkInDate>","<checkOutDate>"
    And User should select the room  "<adultsPerRoom>", "<childrenPerRoom>"
    And User should click the search
       And User should select the hotel name
       And User should click continue
    And User should enter the name  "<firstName>","<lastName>","<billingAddress>","<creditCardNo>"
      And User should select the cc "<creditCardType>","<expiryMonth>","<expiryYear>"
        And User should enter the ccv "<cvvNumber>"
        And User should click the book buton
        Then User should generate the order id

    Examples: 
      | userName   | password   | location | hotels        | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName  | lastName     | billingAddress | creditCardNo     | creditCardType | expiryMonth | expiryYear | cvvNumber |
      | varunvarun | 9600183978 | Paris    | Hotel Cornice | Deluxe   | 4-Four        | 27/02/2020  | 01/03/2020   | 4-Four        | 2-Two           | varunvarun | sathishvarun | omr            | 9876543212341234 | VISA           | July        |       2021 |       432 |
