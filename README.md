Selenium Java Test Automation Framework using POM model

Overview

This project is a Selenium WebDriver automation framework built in Java using the Page Object Model (POM) design pattern. The purpose of this framework is to automate workflows on a sample website, validating functionality, stability, and regression performance.

---

## Salient features are as follows:
- Selenium WebDriver with Java
- TestNG for test orchestration
- Page Object Model (POM) for scalable test design
- ExtentReports for detailed HTML reporting
- WebDriverManager for automatic driver setup
- Screenshots captured on test failure
- Configurable test data and environment setup

---

## Project Structure

```
selenium-java-pom/
│
├── src/test/java/
│   ├── base/
│   │   └── BaseTest.java
│   ├── pages/
│   │   ├── LoginPage.java
│   │   └── HomePage.java
│   ├── tests/
│   │   ├── LoginTest.java
│   │   └── HomePageTest.java
│   ├── utils/
│   │   ├── ConfigReader.java
│   │   └── ScreenshotUtil.java
│
├── src/test/resources/
│   ├── testng.xml
│   ├── config.properties
│
├── reports/
│   └── ExtentReport.html
│
├── pom.xml
└── README.md
```

---

## Technologies used

| Component | Description |
|------------|-------------|
| Language | Java |
| Build Tool | Maven |
| Testing Framework | TestNG |
| Automation Tool | Selenium WebDriver |
| Design Pattern | Page Object Model (POM) |
| Reporting | ExtentReports |

---

## 💻 Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/rakshit-o/selenium-java-pom.git
```

### 2️⃣ Install Dependencies
Ensure Maven and JDK (>=11) are installed.
```bash
mvn clean install
```

### 3️⃣ Run Tests
```bash
mvn test
```
or run via TestNG suite file:
```bash
testng src/test/resources/testng.xml
```

### 4️⃣ View Reports
Reports are generated under:
```
/reports/ExtentReport.html
```

---

## 🧠 Design Principles
- Follows POM to separate logic from UI structure.
- Reusable components for setup, teardown, and utilities.
- Easy to scale and maintain as test coverage expands.

---

## 📷 Sample Screenshot
![Extent Report Screenshot](reports/sample_report.png)

---

## 🧑‍💻 Author
**Rakshit O**  
Quality Engineer | Automation Tester  
📧 rakshit.o@example.com  
🌐 [LinkedIn Profile or Portfolio Link]

---

## 🧩 Future Enhancements
- Add CI/CD integration using GitHub Actions or Jenkins  
- Introduce cross-browser and parallel testing  
- Extend coverage for API and performance testing  
- Implement Allure Reports for enhanced analytics
