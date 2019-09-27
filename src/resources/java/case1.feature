Feature: Register
Scenario: user registration
Given user should be in sign_up page
When user should enter username as"ganavihs"
And  enter firstname as "ganavi"
And  enter lastname as "hs"
And  enter password as"password123"
And  enter confirm password as "password123"
And  selcet gender as "female"
And  enter email as "ganavi@email.com"
And enter Mobile Number as "9972594197"
And enter DOB as "24/3/1998"
And enter Address  as "mysore karnataka"
And select Security Question  as "What is your Birth Place?"
And enter Answer as"mysuru"
And user should click "Register" button
Then user must be in Login page