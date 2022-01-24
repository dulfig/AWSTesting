# AWSTesting
- Test the functionality of aws.amazon.com through the use of Selenium WebDriver
- Navigate through particular use cases to test happy path of links
## Design
- Created a model based off of MVC design pattern
  - Model
    - Localized setup of data being extracted from website
  - View
    - Searches current Web Page for particular WebElements
  - Controller
    - Computes logic for the testing environment
    - Uses Model and View instances
- Created a DataTable object to store test data using Jackson to stitch the object types together
## Tools
- Java 8
- Maven
- Selenium
- Cucumber
- Jackson
