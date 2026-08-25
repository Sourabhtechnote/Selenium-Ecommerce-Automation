# Selenium E-commerce Automation Project

## Project Overview

This is a basic e-commerce web automation testing project built using Selenium WebDriver, Java, Maven, and TestNG.

The project automates the main user flow of the SauceDemo website, including login, product selection, cart, and checkout.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

## Application Under Test

SauceDemo

https://www.saucedemo.com/

## Automated Test Scenarios

### Login
- Valid login
- Invalid login

### Products
- Add product to cart
- Sort products

### Checkout
- Select product
- Verify cart product
- Enter customer details
- Complete checkout
- Verify order confirmation

## Project Structure

src
├── main
│   └── java
│       ├── base
│       │   └── BaseTest.java
│       │
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

pom.xml
testng.xml
.gitignore

## Framework Features

- Selenium WebDriver for browser automation
- TestNG for test execution and assertions
- Page Object Model for organizing page-related actions
- Explicit waits for synchronization
- Maven for dependency management
- TestNG XML for suite execution
- Git/GitHub for source code management

## How to Run

1. Clone the repository.
2. Import the project as a Maven project in Eclipse or another Java IDE.
3. Allow Maven to download the required dependencies.
4. Run `testng.xml` as a TestNG Suite.

## Test Credentials

Username:

standard_user

Password:

secret_sauce

These are the publicly provided demo credentials for SauceDemo.

## Test Result

The test suite contains 5 test cases covering login, product, and checkout functionality.