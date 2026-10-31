
# Web Development Lab Exercises

This repository contains practical exercises completed while learning web development and related programming concepts. It includes static HTML/CSS pages, XML with XSLT, browser-side JavaScript, Node.js programs, MongoDB aggregation, and Java programs.

## Contents

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

- A modern web browser for the HTML/XML exercises.
- Node.js and npm for sections 9 and 10.
- A JDK for sections 7 and 8.
- MongoDB running locally for section 10.

## Running the Exercises

### HTML, CSS, and XML

Open the relevant `.html` file directly in a browser.

To view the XML catalogue with its XSLT stylesheet, open `section 3/dtd.xml`. If the browser blocks local XML transformations, serve the project with a local HTTP server and open the file through that server.

### Section 9: Node.js Utility

```powershell
cd "section 9"
node utility.js
```

The menu supports:
- Uppercase conversion
- Factorial calculation
- Random password generation
- Exit

### Section 10: MongoDB Aggregation

Install the Node.js dependency:

```powershell
cd "section 10"
npm install
```

Start MongoDB locally, then run:

```powershell
node aggregateUsers.js
```

The program connects to `mongodb://localhost:27017/`, reads the `userDB.users` collection, filters users aged 18 or above, and groups them by city.

Each user document should include at least `age` and `city` fields.

### Section 7: Java Calculator

```powershell
cd "section 7"
javac ApplicationProgram.java
java ApplicationProgram
```

### Section 8: Employee Example

```powershell
cd "section 8"
javac Employee.java EmployeeTest.java
java EmployeeTest
```

Compiled Java `.class` files are ignored by Git.

## Notes

- These are independent lab exercises rather than one combined application.
- The Node.js package lockfile is included so section 10 dependencies can be installed reproducibly.
- Ensure MongoDB is running before executing section 10.

---

## Copyright & License

Copyright © 2026 Aayush Sharma. All Rights Reserved.

This repository and all its source code, files, programs, documentation, and other materials are the intellectual property of the copyright owner.

No permission is granted to any individual or organization to:

- Copy or reproduce this repository or its contents.
- Use or modify the source code.
- Redistribute or republish the code.
- Use the project for commercial purposes.
- Claim this work as their own.

Any unauthorized use, reproduction, modification, or distribution without prior written permission from the copyright owner is prohibited.

For permission or licensing inquiries, contact the copyright owner.

**License:** Proprietary – All Rights Reserved.
