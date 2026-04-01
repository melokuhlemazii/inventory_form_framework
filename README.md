# Inventory Form Framework

## Overview
This is a Java-based test automation framework using Selenium WebDriver and TestNG for automating the inventory form on the Ndosi Simplified Automation web application. The framework follows the Page Object Model (POM) design pattern to enhance maintainability and readability of the test code. It supports cross-browser testing and includes utilities for screenshot capture during test execution.

## Features
- **Page Object Model (POM)**: Organized page classes for better code maintenance.
- **Cross-Browser Support**: Supports Chrome, Firefox, Edge, Safari, and Internet Explorer.
- **Screenshot Capture**: Automatic screenshot taking at key test steps.
- **TestNG Integration**: For test execution, assertions, and reporting.
- **WebDriverManager**: Automatic management of WebDriver binaries.
- **Maven Build**: Easy dependency management and build process.

## Technologies Used
- **Java 24**: Programming language.
- **Selenium WebDriver 4.41.0**: For browser automation.
- **TestNG 7.12.0**: For test execution and reporting.
- **WebDriverManager 6.3.3**: For automatic driver management.
- **Maven**: Build tool and dependency management.
- **Apache Commons IO**: For file operations (used in screenshot utility).

## Project Structure
```
inventory_form_framework/
├── pom.xml
├── README.md
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
│       │   ├── ExtentReports/
│       │   │   ├── ExtentReportManager.java
│       │   │   └── Listener.java
│       │   ├── Pages/
│       │   │   ├── DashboardPage.java
│       │   │   ├── InventoryPage.java
│       │   │   ├── InvoicePage.java
│       │   │   ├── LoginPage.java
│       │   │   └── OrderPreviewPage.java
│       │   ├── Tests/
│       │   │   └── InventoryPurchaseTest.java
│       │   └── Utilities/
│       │       ├── BrowserFactory.java
│       │       └── Screenshots.java
│       └── resources/
└── target/
    ├── generated-test-sources/
    │   └── test-annotations/
    ├── screenshots/
    │   ├── completePurchase.jpeg
    │   ├── enterLoginDetails.jpeg
    │   ├── navigateToWebAutomationAdvance.jpeg
    │   ├── selectDeviceInformation.jpeg
    │   └── viewInvoice.jpeg
    └── test-classes/
        ├── Base/
        │   └── BaseTest.class
        ├── DefaultTest/
        │   └── DefaultLoginTest.class
        ├── ExtentReports/
        │   ├── ExtentReportManager.class
        │   └── Listener.class
        ├── Pages/
        │   ├── DashboardPage.class
        │   ├── InventoryPage.class
        │   ├── InvoicePage.class
        │   ├── LoginPage.class
        │   └── OrderPreviewPage.class
        ├── Tests/
        │   └── InventoryPurchaseTest.class
        └── Utilities/
            ├── BrowserFactory.class
            └── Screenshots.class
```

## Prerequisites
- Java JDK 24 or higher
- Maven 3.6 or higher
- One of the supported browsers: Chrome, Firefox, Edge, Safari, or Internet Explorer (Chrome is the default)

## Installation
1. Clone or download the project to your local machine.
2. Navigate to the project root directory: `inventory_form_framework`
3. Run `mvn clean install` to download dependencies, compile the project, and run tests.

## Configuration
- **Browser Selection**: Modify the `browserChoice` variable in `BaseTest.java` to choose a different browser (e.g., "firefox", "edge", "safari", "internetexplore"). Default is "chrome".
- **Application URL**: The base URL is set in `BaseTest.java` as `https://ndosisimplifiedautomation.vercel.app/`. Update if needed.
- **Screenshot Directory**: Screenshots are saved to `target/screenshots/`. This can be changed in `Screenshots.java`.

## Usage
### Running Tests
- **Run All Tests**: `mvn test`
- **Run Specific Test Class**: `mvn test -Dtest=InventoryPurchaseTest`
- **Run Specific Test Method**: `mvn test -Dtest=InventoryPurchaseTest#loginWithValidDetails`
- **Run with Different Browser**: Update `browserChoice` in `BaseTest.java` and run `mvn test`

### Test Execution Details
The main test suite `InventoryPurchaseTest` performs the following steps:
1. **Login**: Logs in with valid credentials.
2. **Navigation**: Navigates to the Web Automation Advance section.
3. **Device Selection**: Selects device type, brand, storage, color, quantity, and address.
4. **Purchase Completion**: Applies shipping, warranty, discount, and completes purchase.
5. **Invoice Viewing**: Views the generated invoice.

Screenshots are captured at key points and saved in `target/screenshots/`.

## Test Classes
- **InventoryPurchaseTest**: End-to-end test for the inventory purchase flow.
- **DefaultLoginTest**: (Located in DefaultTest package) Basic login test.

## Page Objects
- **LoginPage**: Handles login form interactions (email, password, submit).
- **DashboardPage**: Manages navigation to learning materials and web automation sections.
- **InventoryPage**: Handles device selection (type, brand, storage, color, quantity, address).
- **OrderPreviewPage**: Manages order options (shipping, warranty, discount) and purchase.
- **InvoicePage**: Handles invoice viewing actions.

## Utilities
- **BrowserFactory**: Initializes and manages WebDriver instances for different browsers.
- **Screenshots**: Captures and saves screenshots during test execution.
- **BaseTest**: Base class that sets up WebDriver, initializes page objects, and provides common setup/teardown.

## Reporting
- **Screenshots**: Automatically taken during tests and stored in `target/screenshots/`.
- **TestNG Reports**: Default TestNG HTML reports generated in `target/surefire-reports/`.
- **ExtentReports**: Framework prepared for ExtentReports integration (classes exist but not implemented).

## Dependencies
The project uses the following Maven dependencies:
- `org.seleniumhq.selenium:selenium-java:4.41.0`
- `org.testng:testng:7.12.0`
- `io.github.bonigarcia:webdrivermanager:6.3.3`
- `commons-io:commons-io:2.11.0` (Note: This should be added to pom.xml for screenshot functionality)

## Adding New Tests
1. Create a new test class in `src/test/java/Tests/` that extends `BaseTest`.
2. Use `@Test` annotations for test methods.
3. Specify test dependencies with `dependsOnMethods` if needed.
4. Utilize existing page objects for interactions.
5. Add assertions to verify expected behavior.

Example:
```java
@Test(dependsOnMethods = "existingTestMethod")
public void newTestMethod() {
    // Test logic here
}
```

## Adding New Page Objects
1. Create a new class in `src/test/java/Pages/` with a WebDriver constructor.
2. Use `@FindBy` annotations for locating web elements.
3. Implement methods for user interactions on the page.

Example:
```java
public class NewPage {
    WebDriver driver;

    @FindBy(id = "elementId")
    WebElement element;

    public NewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void interactWithElement() {
        element.click();
    }
}
```

## Build and Run
- **Clean and Compile**: `mvn clean compile`
- **Run Tests**: `mvn test`
- **Generate Reports**: TestNG reports are automatically generated after test runs.

## Troubleshooting
- **Browser Not Starting**: Ensure the browser is installed and WebDriverManager can download the driver.
- **Tests Failing**: Check if the application URL is accessible. Update credentials or selectors if the application has changed.
- **Screenshot Issues**: Ensure the `target/screenshots/` directory exists or is writable.
- **Dependency Issues**: Run `mvn clean install` to resolve dependencies.

## Notes
- The framework targets the web application at `https://ndosisimplifiedautomation.vercel.app/`.
- Thread.sleep() is used in tests for demonstration purposes; consider using WebDriverWait for more robust waits in production.
- The tearDown method in BaseTest is commented out; uncomment to automatically close the browser after tests.
- ExtentReports integration is planned but not yet implemented.

## Contributing
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-name`
3. Commit changes: `git commit -am 'Add feature'`
4. Push to branch: `git push origin feature-name`
5. Submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Authors
- [Your Name] - Initial work

## Acknowledgments
- Selenium WebDriver community
- TestNG framework
- WebDriverManager library
