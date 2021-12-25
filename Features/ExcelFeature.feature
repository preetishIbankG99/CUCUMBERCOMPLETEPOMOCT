Feature: AdminLogin Feature Test

Scenario Outline: Admin credntials scenario with different set of data
Given user navigates to OrangeHRM page
When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on loggedin button
Then Title of WebPage is ORANGEHRM .

Examples:
|SheetName|RowNumber|
|login|0|
|login|1|

