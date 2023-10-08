# Android Unit Testing Demo 
(JUnit , Espresso and Mockito)

This Android project serves as a demonstration of unit testing in Android using JUnit, Espresso, and Mockito. The goal of this demo is to showcase how to write and run unit tests for Android applications to ensure code quality, reliability, and correctness.

## Getting Started

1. Clone or download this repository to your local machine:

   ```bash
   git clone https://github.com/PanktiSP13/Android_Unit_Testing_Demo.git
   ```

2. Open the project in Android Studio.

## Running Unit Tests

This project includes both JUnit unit tests and Espresso UI tests. Here's how to run them:

### JUnit Unit Tests

1. Navigate to the `app/src/test` directory in the project.
2. Right-click on the package containing your unit tests and select "Run Tests in com.pankti.androidunittestingdemo"

### Espresso UI Tests

1. Navigate to the `app/src/androidTest` directory in the project.
2. Right-click on the package containing your Espresso UI tests and select "Run Tests in com.pankti.androidunittestingdemo"

## JUnit Unit Tests

JUnit is used for writing and running unit tests for non-UI components, such as business logic, data processing, and utility functions. In this project, you can find examples of JUnit tests in the `app/src/test` directory. Explore these tests to understand how to write and structure unit tests for Android.

## Espresso UI Tests

Espresso is employed for UI testing to verify the behavior of your app's user interface. You'll find Espresso UI test examples in the `app/src/androidTest` directory. These tests simulate user interactions and validate the app's response. Study these examples to learn how to create UI tests for Android activities and UI components.

## Mockito Mocking

Mockito is demonstrated in this project for mocking dependencies during unit tests. Take a look at the `app/src/test` directory for examples of Mockito usage. Mocking is essential for isolating the code being tested from its dependencies, making it easier to write comprehensive unit tests.

## Contributing

Contributions to this project are welcome. If you'd like to contribute, feel free to open issues, submit pull requests, or provide suggestions for improvements. Let's collaborate to make this demo even better!

## License

This project is licensed under the [MIT License](LICENSE). Please refer to the license file for more details.

---
