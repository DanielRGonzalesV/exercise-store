# Exercise UI Test  - Automation framework
Test automation project based on Serenity BDD.

## Setup

### Requirements:
* Java Development Kid: Java SE 11 (LTS) recommended.
    [Download JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
* IntelliJ IDEA: Community Edition.
    [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download) 

### Open the project on IntelliJ IDEA

1. Clone this repository
2. Open IntelliJ IDE
3. Select File > New > Project from Existing Sources...
4. Select the folder cloned from this repository
5. Select Gradle in the "Import Project" window and click "Next"
6. Select "Finish"

## Execute the tests
To run the automated tests, you can either just run the test runner class directly , or run the following command from project root path.

```json
$ gradlew clean test
```

By default, the tests will run using the last Chrome stable version (tested version: 81.0.4044.92)


You can see the final report in:
```json
./target/site/serenity/index.html
```
