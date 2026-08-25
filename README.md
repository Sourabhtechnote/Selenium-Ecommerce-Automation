# Selenium E-commerce Automation

## 📌 Project Overview

Web UI automation testing project built using Selenium WebDriver,
Java, TestNG, Maven, and Page Object Model (POM).

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | Web browser automation |
| TestNG | Test execution & assertions |
| Maven | Dependency management |
| Page Object Model | Framework structure |
| Git & GitHub | Version control |

## 🧪 Automated Test Scenarios

### Login
- Valid login
- Invalid login

### Products
- Add product to cart
- Sort products
- Verify product price

### Checkout
- Enter customer details
- Navigate to checkout overview
- Complete checkout
- Verify order confirmation

## 📂 Project Structure
```
src
├── main
│   └── java
│       ├── base
│       │   └── BaseTest.java
│       └── pages
│           ├── LoginPage.java
│           ├── ProductsPage.java
│           ├── CartPage.java
│           └── CheckoutPage.java
│
└── test
    └── java
        └── tests
            ├── LoginTest.java
            ├── ProductTest.java
            └── CheckoutTest.java

├── pom.xml
├── testng.xml
└── .gitignore
```

## ⚙️ Framework Features

- Selenium WebDriver
- TestNG annotations and assertions
- Page Object Model (POM)
- Explicit waits
- Implicit wait
- Reusable BaseTest class
- TestNG XML suite execution
- Maven dependency management

## ▶️ How to Run

1. Clone the repository.
2. Import the project as a Maven project in Eclipse.
3. Allow Maven to download dependencies.
4. Run `testng.xml` as a TestNG Suite.

## 🔐 Test Credentials

Username: `standard_user`

Password: `secret_sauce`

## 📊 Test Execution

Current suite contains **5 automated test cases**.

| Test Class | Test Cases |
|---|---:|
| LoginTest | 2 |
| ProductTest | 2 |
| CheckoutTest | 1 |
| **Total** | **5** |

## 🌐 Application Under Test

[SauceDemo](https://www.saucedemo.com/)

## 📌 Project Purpose

This project demonstrates web UI automation using Selenium WebDriver with
Java and TestNG, following a Page Object Model based framework structure.

# 👨‍💻 Author

**Sourabh Kurhade**
---
Thank you for your time, We welcome your suggestions and contributions. :) 
Sksourabh07@gmail.com 
