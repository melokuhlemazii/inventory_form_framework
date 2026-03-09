# Inventory Form Framework

## Overview
This is a Java-based test automation framework using Selenium WebDriver and TestNG for automating the inventory form on the Ndosi Simplified Automation web application. The framework follows the Page Object Model (POM) design pattern to enhance maintainability and readability of the test code.

## Technologies Used
- **Java**: Programming language
- **Selenium WebDriver 4.41.0**: For browser automation
- **TestNG 7.12.0**: For test execution and reporting
- **WebDriverManager 6.3.3**: For automatic driver management
- **Maven**: Build tool and dependency management

## Project Structure
```
inventory_form_framework/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── Base/
│       │   │   └── BaseTest.java
│       │   ├── DefaultTest/
│       │   │   └── DefaultLoginTest.java
│       │   ├── Pages/
│       │   │   ├── DashboardPage.java
│       │   │   ├── InventoryPage.java
│       │   │   ├── InvoicePage.java
│       │   │   ├── LoginPage.java
│       │   │   └── OrderPreviewPage.java
│       │   ├── Tests/
│       │   │   └── InventoryPurchaseTest.java
│       │   └── Utilities/
│       │       └── BrowserFactory.java
│       └── target/
│           ├── generated-test-sources/
│           └── test-classes/
```

## Prerequisites
- Java JDK 24 or higher
- Maven 3.6 or higher
- Chrome, Firefox, Edge, Safari, or Internet Explorer browser (Chrome is default)

## Setup
1. Clone or download the project.
2. Navigate to the project root directory.
3. Run `mvn clean install` to download dependencies and compile the project.

## Running Tests
- To run all tests: `mvn test`
- To run a specific test class: `mvn test -Dtest=InventoryPurchaseTest`
- To run tests with a specific browser: Modify the `browserChoice` in `BaseTest.java` (e.g., "firefox", "edge")

## Test Classes
- **InventoryPurchaseTest**: Automates the full flow of logging in, selecting device information, completing purchase, and viewing invoice.

## Page Objects
- **LoginPage**: Handles login functionality
- **DashboardPage**: Manages dashboard interactions
- **InventoryPage**: Deals with inventory selection
- **OrderPreviewPage**: Handles order preview and purchase
- **InvoicePage**: Manages invoice viewing

## Utilities
- **BrowserFactory**: Manages WebDriver setup and teardown for different browsers
- **BaseTest**: Base class for all tests, initializes WebDriver and page objects

## Adding New Tests
1. Create a new test class in `src/test/java/Tests/` extending `BaseTest`.
2. Use `@Test` annotations and specify dependencies if needed.
3. Utilize existing page objects or create new ones in the `Pages/` directory.

## Adding New Page Objects
1. Create a new class in `src/test/java/Pages/` with WebDriver constructor.
2. Use `@FindBy` annotations for element locators.
3. Implement methods for interactions with the page elements.

## Notes
- The framework targets the web application at `https://ndosisimplifiedautomation.vercel.app/`.
- Thread.sleep() is used in tests for demonstration; consider using WebDriverWait for production use.
- TearDown method in BaseTest is commented out; uncomment to close browser after tests.

## Contributing
Feel free to contribute by adding new tests, improving page objects, or enhancing the framework structure.
