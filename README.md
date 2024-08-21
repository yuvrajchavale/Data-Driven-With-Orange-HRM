<!-- This is your README.md file -->

<h1 align="center">DataDriven Framework</h1>

<p align="center">
  A robust data-driven testing framework built using Java and TestNG. This framework leverages data from external files like Excel to drive test execution, ensuring comprehensive coverage and reusability.
</p>

---

<h2>🚀 Features</h2>

<ul>
  <li><strong>Data-Driven Testing:</strong> Enables testing with multiple sets of data read from Excel files.</li>
  <li><strong>Reusable Functions:</strong> Common functions are centralized for efficient test management.</li>
  <li><strong>Page Object Model (POM):</strong> Implements the POM design pattern for modular and scalable test code.</li>
  <li><strong>TestNG Integration:</strong> Manages test execution, dependencies, and reporting.</li>
  <li><strong>Custom Reports:</strong> Generates detailed Excel and HTML reports for each test execution.</li>
</ul>

---

<h2>📂 Project Structure & Class Descriptions</h2>

<pre>
DataDriven_Framework
│
├── src
│   ├── com.page
│   │   ├── AdminLogin.java
│   │   │   - Handles the login functionality for admin users using data from Excel sheets.
│   │   ├── AdminLogout.java
│   │   │   - Manages the admin logout process and validation of successful logout.
│   │   ├── CustomerPage.java
│   │       - Defines the interactions with the customer page for testing customer-related actions.
│   ├── commonFunctions
│   │   └── FunctionLibrary.java
│   │       - Contains reusable methods for interacting with elements, handling exceptions, and performing common actions across tests.
│   ├── config
│   │   ├── AppUtil.java
│   │   │   - Centralized utility methods for setting up the application configuration and environment setup.
│   │   └── ERP_AppUtil.java
│   │       - Provides ERP-specific utility functions for handling complex workflows and actions within the ERP system.
│   ├── driverFactory
│   │   ├── DriverScript.java
│   │   │   - Acts as the main driver for the framework, executing the test scripts based on the provided data.
│   │   └── TestScript.java
│   │       - Contains the main test scripts that interact with various pages and execute assertions based on the test scenarios.
│   └── utilities
│       └── ExcelFileUtil.java
│           - Handles reading and writing of data from Excel files (e.g., CustomerData.xlsx, Login.xlsx) for use in test execution.
│
├── FileInput
│   ├── CustomerData.xlsx
│   │   - Contains customer data that will be used for data-driven test execution.
│   └── Login.xlsx
│       - Stores login credentials and other related data for login-related tests.
│
├── FileOutput
│   ├── DataDrivenResults.xlsx
│   │   - The result of test execution stored in an Excel file for easy analysis.
│   └── PomResults.xlsx
│       - Stores test results specifically for POM-based tests executed within the framework.
│
├── PropertyFiles
│   └── Environment.properties
│       - Stores environment-specific properties like URLs, browser configurations, and other key-value pairs used during test execution.
│
├── Reports
│   ├── Customer.html
│   │   - HTML report summarizing the results of customer-related test executions.
│   └── Login.html
│       - HTML report generated for login test scenarios, detailing the success or failure of each step.
│
└── test-output
    - Contains the TestNG reports and logs generated after the execution of test cases.
</pre>

---

<h2>📦 Dependencies</h2>

Ensure the following are installed:

<ul>
  <li><strong>Java</strong> (version 17 or above)</li>
  <li><strong>TestNG</strong> (latest version)</li>
</ul>

<h3>📚 Libraries Used</h3>
<ul>
  <li><strong>Apache POI</strong> (for reading/writing Excel files)</li>
  <li><strong>Selenium WebDriver</strong> (for browser automation)</li>
  <li><strong>TestNG</strong> (for test execution and reporting)</li>
  <li><strong>Maven</strong> (for project management and dependency resolution)</li>
</ul>

---

<h2>🛠️ How to Run the Tests</h2>

<ol>
  <li><strong>Clone the repository:</strong>
    <pre>
    git clone https://github.com/yourusername/DataDriven_Framework.git
    cd DataDriven_Framework
    </pre>
  </li>
  <li><strong>Install the dependencies:</strong>
    <pre>
    mvn clean install
    </pre>
  </li>
  <li><strong>Run the tests:</strong>
    <pre>
    mvn test
    </pre>
  </li>
</ol>

---

<h2>📝 Test Data Structure</h2>

<p>
Test data is stored in the <code>FileInput</code> directory as Excel files (e.g., <code>CustomerData.xlsx</code>, <code>Login.xlsx</code>). The framework reads data from these files and uses them to drive test scenarios.
</p>

---

<h2>📊 Test Results</h2>

<p>
After execution, test results are stored both in Excel format in the <code>FileOutput</code> directory and as HTML reports in the <code>Reports</code> directory. These reports summarize the test outcomes and provide detailed logs.
</p>

---

<h2>🌐 Contribution Guidelines</h2>

<p>
Contributions are welcome! Whether it's reporting a bug, suggesting an enhancement, or submitting a pull request, your contributions make this framework better.
</p>

<ol>
  <li>Fork the repo</li>
  <li>Create a feature branch (<code>git checkout -b feature/your-feature</code>)</li>
  <li>Commit your changes (<code>git commit -m 'Add feature'</code>)</li>
  <li>Push to the branch (<code>git push origin feature/your-feature</code>)</li>
  <li>Create a Pull Request</li>
</ol>

---

<h2>🎨 Technologies Used</h2>

<ul>
  <li><strong>Java 17</strong></li>
  <li><strong>Maven</strong></li>
  <li><strong>TestNG</strong></li>
  <li><strong>Selenium WebDriver</strong></li>
  <li><strong>Apache POI</strong></li>
</ul>

---

<h2>🌟 Show Your Support</h2>

<p>
If you found this framework useful, please consider giving it a ⭐ on GitHub!
</p>
