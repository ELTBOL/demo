# Corporate Website UI/Functional Test Automation Framework
Table of Contents
=================

<!--ts-->
* [Getting Started](#getting-started)
* [Project Structure](#project-structure)
* [Todo](#todo)
* [Documentation](#documentation)

<!--te-->

Getting Started
===============

Tech Stack:

1) Maven - Build Tool
2) TestNG - Test Runner
3) Selenium - Browser Automation
4) Selenium Grid via AWS/EC2 Instances - Cross Browser Testing (Hub & Nodes)
5) Git/GitHub - Version Control & Code Repository
6) GitHub Actions - CI/CD Pipeline

Maven Setup:

1) Install Maven (<http://maven.apache.org/download.cgi>)
2) Setup M2_HOME & MAVEN_HOME in environment variables configuration and add \bin to path (C:\Users\username\apache-maven-3.8.1\bin)

Java/JDK Setup:

1) Install JDK (<https://adoptopenjdk.net/>)
2) Setup JAVA_HOME (JDK and not JRE) in environment variables configuration and add \bin to path (C:\Program Files\Java\jdk1.8.0_281)

Eclipse Code Setup:

1) Create a Local Development Workspace directory
2) Install Java Extension Pack in Eclipse
3) Navigate to your workspace directory and clone this repository from within the Azure Dev Ops Git Repos Dashboard
4) Open the Maven project using Eclipse and bootstrap the initial setup by running the following command in your terminal within the project root directory (Powershell, Git Bash)

```
mvn clean install -DskipTests
```

Developer Productivity Setup:

Below are a few Eclipse Code Extensions that integrate well with this test development workflow.

Core Java:

1) Language Support by Red Hat
2) Java Extension Pack
3) Eclipse
4) Maven for Java
5) Debugger for Java


Formatting:

1) Bracket Pair Colorizer 2
2) Better Comments

Linting:

1) Sonar Qube
2) Sonar Lint
3) Markdown Lint
4) Checkstyle for Java

Version Control:

1) GitLens
2) Git History

Project Structure
=================

```
UI/Functional Test Automation 
|
|- src/main
| |- src/main/java (Providers, Managers, Enums & Logger)
| |- src/main/resources (Drivers, Log Properties, External Test Data)
|
|- src/test
| |- src/test/java (Providers, Managers, Enums & Utilities)
| |- src/test/resources (Features, Steps, Page Objects, Utility, Cucumber/TestNG Runner)
|
|- configs (Configuration)
| |- Config.properties
|
|- results (Reporting)
| |- Extent Reports
|
|- .github/workflows (GitHub Actions CI/CD Pipeline Yaml)
|- pom.xml (Project Dependencies)
|- testng.xml (Test Runner: @Smoke & @Regression)
|- gitignore (Ignored Files/Folders)
|- README.md (Project Description)
```

Documentation
=============

Maven - <https://maven.apache.org/guides/>

TestNG - <https://testng.org/doc/documentation-main.html>

Selenium - <https://www.selenium.dev/documentation/en/>

Selenium API - <https://www.selenium.dev/selenium/docs/api/java/overview-summary.html> 

GitHub Actions - https://docs.github.com/en/actions

