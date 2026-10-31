# Digital Scam Prevention System

<div align="center">
  <img src="https://img.shields.io/badge/Protection-Scam%20Aware-blue" alt="Protection badge" />
</div>

Spot suspicious messages, links, and payment QR codes before you act.

An explainable, privacy-minded web application for reviewing digital scam signals and getting safer next steps.

### Features · How it works · Get started · API · Security · Contributing · License

<div align="center">

[![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://developer.mozilla.org/docs/Web/JavaScript)
[![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/docs/Web/HTML)
[![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/docs/Web/CSS)

</div>

## Overview

This repository is a collection of web technology lab exercises that also reflects the theme of a digital scam prevention project. The goal is to practice front-end, XML, JavaScript, Node.js, MongoDB, and Java development while building a safe and awareness-focused product concept.

The project includes several independent, hands-on exercises covering:

- HTML/CSS user interfaces
- XML + XSLT data presentation
- Browser-side JavaScript validation
- Node.js utilities and database aggregation
- Java desktop and testing examples

## Repository structure

| Folder | Description | Main files |
| --- | --- | --- |
| `section 1` | College department information page | `Home.html` |
| `section 2` | Student entry form | `entryform.html` |
| `section 3` | Online book shop cart and XML catalogue | `cart.html`, `dtd.xml`, `style.xsl` |
| `section 4` | Styled registration form | `registration.html`, `style.css` |
| `section 5` | Browser information page | `browser.html` |
| `section 5/section 6` | Registration form with JavaScript validation | `validation.html`, `script.js`, `style.css` |
| `section 7` | Java Swing calculator | `ApplicationProgram.java` |
| `section 8` | Java employee class and test program | `Employee.java`, `EmployeeTest.java` |
| `section 9` | Interactive Node.js command-line utility | `utility.js` |
| `section 10` | MongoDB user aggregation with Node.js | `aggregateUsers.js`, `package.json` |

## Requirements

- Modern web browser for HTML/XML exercises
- Node.js and npm for sections 9 and 10
- JDK for sections 7 and 8
- MongoDB running locally for section 10

## Getting started

### HTML, CSS, and XML

Open the relevant `.html` file directly in a browser. To view the XML catalogue with its XSLT stylesheet, open `section 3/dtd.xml`.

If your browser blocks local XML transformations, serve the project from a local HTTP server and open the file through that server.

### Section 9: Node.js utility

```powershell
cd "section 9"
node utility.js
```

The menu supports uppercase conversion, factorial calculation, random password generation, and exit.

### Section 10: MongoDB aggregation

Install the dependency first:

```powershell
cd "section 10"
npm install
```

Then start MongoDB locally and run:

```powershell
node aggregateUsers.js
```

The program connects to `mongodb://localhost:27017/`, reads the `userDB.users` collection, filters users aged 18 or above, and groups results by city.

### Section 7: Java calculator

```powershell
cd "section 7"
javac ApplicationProgram.java
java ApplicationProgram
```

### Section 8: Employee example

```powershell
cd "section 8"
javac Employee.java EmployeeTest.java
java EmployeeTest
```

Compiled Java `.class` files are ignored by Git.

## Why this project matters

The scam prevention theme is a strong real-world example of how digital safety tools can help users detect suspicious patterns before they become victims. In the same way, each lab exercise here demonstrates practical web and programming fundamentals used to build modern, responsive, and secure digital products.

## Notes

This repository is organized as a set of independent lab exercises rather than a single application. Each section can be run separately and is intended for learning and experimentation.

The Node.js package lockfile is included so section 10 dependencies can be installed reproducibly.
