# 🧪 Automated UI Testing Framework

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-8+-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Selenium](https://img.shields.io/badge/Selenium-4.25-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-23D96C?logo=cucumber&logoColor=white)](https://cucumber.io/)

A comprehensive **Selenium WebDriver** test automation framework built with the **Cucumber BDD** (Behavior-Driven Development) approach, **Page Object Model (POM)** design pattern, and **Allure** reporting. This project demonstrates industry-standard automated UI testing practices for web applications.

---

## ✨ Features

- **🥒 BDD with Cucumber** — Write human-readable test scenarios using Gherkin syntax (`.feature` files).
- **📄 Page Object Model** — Clean separation of test logic and page interactions for maintainability.
- **📊 Allure Reporting** — Beautiful, interactive test reports with execution history and screenshots.
- **📁 Data-Driven Testing** — CSV-based parameterized tests using Apache Commons CSV.
- **🔧 Cross-Browser Ready** — Selenium WebDriver with configurable browser drivers.
- **🏗️ Maven Build** — Fully managed build lifecycle with Maven Surefire plugin.

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|-----------|
| **Language** | Java 8+ |
| **Test Framework** | JUnit 4, Cucumber 7 |
| **Browser Automation** | Selenium WebDriver 4.25 |
| **Reporting** | Allure Reports 2.13 |
| **Build Tool** | Apache Maven |
| **Data Source** | CSV (Apache Commons CSV) |
| **Design Pattern** | Page Object Model (POM) |

---

## 📦 Getting Started

### Prerequisites
- Java JDK 8 or higher
- Apache Maven
- Chrome/Firefox browser + corresponding WebDriver

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/saif55045/22f3644_22f3669_SQE.git
   cd 22f3644_22f3669_SQE
   ```

2. **Run all tests:**
   ```bash
   mvn clean test
   ```

3. **Generate Allure report:**
   ```bash
   mvn allure:report
   # Open allure-report/index.html in your browser
   ```

---

## 📐 Project Structure

```
22f3644_22f3669_SQE/
├── src/
│   ├── main/java/
│   │   ├── pageobjects/          # Page Object classes
│   │   │   ├── LoginPage.java    # Login page interactions
│   │   │   └── SearchPage.java   # Search page interactions
│   │   └── com/example/App.java  # Main application class
│   └── test/java/
│       ├── features/             # Cucumber .feature files (Gherkin)
│       │   ├── login.feature     # Login test scenarios
│       │   └── search.feature    # Search test scenarios
│       ├── stepdefinations/      # Cucumber step definitions
│       │   ├── LoginSteps.java
│       │   └── SearchSteps.java
│       ├── runners/
│       │   └── TestRunner.java   # Cucumber test runner
│       ├── tests/
│       │   └── BaseTest.java     # Base test configuration
│       ├── Utilities/
│       │   └── CSVUtil.java      # CSV data reader utility
│       └── data.csv.csv          # Test data file
├── drivers/                      # Browser WebDriver executables
├── allure-report/                # Generated Allure HTML reports
├── pom.xml                       # Maven configuration
└── README.md
```

---

## 🧪 Test Scenarios

### Login Tests (`login.feature`)
- Valid login with correct credentials
- Invalid login with incorrect credentials
- Data-driven login tests from CSV

### Search Tests (`search.feature`)
- Search functionality verification
- Search results validation

---

## 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
