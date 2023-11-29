# TelusTV Automation Project

This project contains automated tests for the TelusTV website using Selenium WebDriver and TestNG.

## Project Structure

The project is structured as follows:

- `src/main/java/com/telustv/Config.java`: Configuration class for reading properties from `config.properties`.
- `src/main/java/com/telustv/HomePage.java`: Page class for interactions with elements on the home page.
- `src/main/java/com/telustv/MoviesPage.java`: Page class for interactions with elements on the movies page.
- `src/main/java/com/telustv/OnDemandPage.java`: Page class for interactions with elements on the On Demand page.
- `src/main/java/com/telustv/Utils.java`: Utility class for common helper methods.
- `src/main/resources/config.properties`: Configuration file containing application properties.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Maven
- WebDriver executable (e.g., ChromeDriver)
- TestNG

### Setup

1. Clone the repository to your local machine.
2. Set up the appropriate WebDriver executable path in the `webdriver.chrome.driver` property in the `Config.java` class.
3. Ensure that the `config.properties` file in `src/main/resources` contains the correct application URL and any other required configurations.
## Running the Project with Maven

To start the project after cloning, you can use the `mvn clean install` command. This command will clean the project, compile the source code, and install the compiled code into your local Maven repository.



## Test Classes

- `src/test/java/com/telustv/TelusTVTest.java`: Test class containing automated tests using TestNG.

## How to Run Tests

To run the tests, use the following Maven command:

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

This command will execute the tests using the TestNG framework, as specified in the `testng.xml` file.

## Customization and Extension

Feel free to customize and extend the project as needed for additional test scenarios. You can:

- Create additional test classes or page classes.
- Add more test methods.
- Enhance utility functions in the `Utils.java` class.

## Adding New Tests

To add new tests:

1. Create a new test class in the `src/test/java/com/telustv` directory.
2. Write test methods within the class.
3. Include the new test class in the `testng.xml` file.

## TestNG Reports

TestNG generates HTML reports that provide detailed information about test execution. After running the tests:

- Find the reports in the `target/surefire-reports` directory.
- Open the `index.html` file in a browser to view the results.


**Important Notes**
- Make sure to set up the appropriate WebDriver executable path in the `webdriver.chrome.driver` property in the `Config.java` class.
- Ensure that the `config.properties` file in `src/main/resources` contains the correct application URL and any other required configurations.

**Customization and Extension**
Feel free to customize and extend the project as needed for additional test scenarios. You can create additional test classes or page classes, add more test methods, and enhance utility functions in the `Utils.java` class.

**CI/CD Integration**
Consider integrating this project into your CI/CD pipeline for automated testing on each build. Configure your CI/CD tool to run the Maven command mentioned above.


