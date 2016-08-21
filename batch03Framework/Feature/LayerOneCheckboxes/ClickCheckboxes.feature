
@chk
Feature: Test the checkboxes

Background: 
* go to practice page 

@chk_01
Scenario: Click on given checkboxes exclusively
* select "BMW" checkbox
* select "BENZ" checkbox
* select "HONDA" checkbox


@chk_02
Scenario: Deselect on all checkbox
* deselect all the checkboxes
* close the browser