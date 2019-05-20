Feature: Login to Facebook and post a status message "Hello World"

@assignment1
Scenario Outline: Login to facebook and post hello world message
Given I launch the <browser>
And I pass the <URL>
When I enter <uname> and <password>
And I click on login button
And I should land on homepage and enter <post> in the create post section
And I click on share button
And I see post has been created successfully


Examples:
| browser|		 URL				|			uname			    |password	  |    post	  |
| chrome |https://www.facebook.com/	| 	hemakumar.1986@gmail.com	|abcdef12345  |Hello_World|