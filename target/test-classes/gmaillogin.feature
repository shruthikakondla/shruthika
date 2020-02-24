Feature: Login Feature File
@selenium
Scenario Outline: Login scenario test for Gmail

Given Launch Gmail page 
When logged in using username as “username” and password as “password”
     |<username>|
     |<password>|
Then Gmail home page should be displayed
     |<Text>|

   
    
    Examples:  
     
    | username | password | Text |
    | shruthika.siri@gmail.com | Akshiv@975 | sample |
    
    