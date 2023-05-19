Feature: Verify the menu structure and menu navigation

  Background:
    Given a user navigates to Teach Away website

  Scenario: User verifies the items in the menu

    When the user is located to the mega menu
    Then all the 5 items are displayed correctly in this order
      | Jobs | Tefl | Teacher Certification | Courses | Hire Teachers |


  Scenario Outline: User validates navigation to corresponding pages when clicking on menu item
    When user clicks on "<item name>"
    Then user is landed to the corresponding page with "<title>"
    Examples:
      | item name     | title                           |
      | Courses       | Courses and Certifications      |
      | Hire Teachers | Start recruiting great teachers |

  Scenario Outline: Hover over each main menu item and verify that the dropdown menu appears

    When user hovers on "<item name>"
    Then user verifies thw dropdown menu appears
    Examples:
      | item name             |
      | Jobs                  |
      | Tefl                  |
      | Teacher Certification |



