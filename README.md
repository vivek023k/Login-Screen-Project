# 🔐 Java Swing Login Screen

A simple **Login Screen desktop application** built using **Java Swing** and **AWT**.

This project demonstrates how to create a basic graphical user interface (GUI) in Java with username/password fields, Login and Clear buttons, keyboard interactions, mouse events, dialogs, and button styling.

## ✨ Features

* 🖥️ Java Swing based desktop GUI
* 👤 Username input field
* 🔑 Password input field
* 🔐 Login authentication
* 🧹 Clear button to reset input fields
* ⌨️ Press **Enter** to move from Username to Password
* ⌨️ Press **Enter** in Password field to trigger Login
* 🖱️ Mouse interaction with buttons
* 🟢 Button background changes while pressing
* ⚠️ Empty-field validation
* ❌ Incorrect username/password warning
* ✅ Successful login message
* 🪟 JOptionPane dialog messages
* 🎨 Custom fonts, colors and component positioning
* 🖱️ Hand cursor for interactive components

## 🛠️ Technologies Used

* **Java**
* **Java Swing**
* **Java AWT**
* **AWT Event Handling**
* **JFrame**
* **JLabel**
* **JTextField**
* **JPasswordField**
* **JButton**
* **ActionListener**
* **MouseListener**
* **JOptionPane**

## 📂 Project Structure

```text
Java-Swing-Login-Screen/
│
├── LoginScreen.java
├── README.md
└── login.ico
```

> `login.ico` is optional and can be used when packaging the application as a Windows `.exe`.

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Java-Swing-Login-Screen.git
```

### 2. Open the Project

Open the project folder in your preferred Java IDE or terminal.

### 3. Compile

```bash
javac LoginScreen.java
```

### 4. Run

```bash
java LoginScreen
```

## 🔑 Demo Login Credentials

The current version uses hard-coded credentials for demonstration purposes.

```text
Username: Myname
Password: 12112
```

> ⚠️ **Note:** This project is for learning purposes. Hard-coded credentials should not be used in a real authentication system.

## ⌨️ Keyboard Controls

| Action                              | Result                  |
| ----------------------------------- | ----------------------- |
| Enter in Username field             | Moves focus to Password |
| Enter in Password field             | Triggers Login          |
| Enter while Clear button is focused | Clears the fields       |
| Mouse click on Login                | Performs Login          |
| Mouse click on Clear                | Clears the fields       |

## 🧠 Concepts Practiced

This project was created to practice Java GUI programming and event handling.

Some of the main concepts used are:

* Classes and Objects
* Inheritance
* Constructors
* Reference Variables
* Inner Classes
* Interfaces
* `ActionListener`
* `MouseListener`
* Event Handling
* `JFrame`
* Swing Components
* `JOptionPane`
* String comparison using `.equals()`
* Password handling using `getPassword()`
* Focus management
* Button events
* GUI component positioning

## 🖼️ Application Preview

Add a screenshot of your application here:

```markdown
![Java Swing Login Screen](screenshot.png)
```

## 📦 Windows EXE

The application can also be packaged as a Windows `.exe` using Java's `jpackage` tool.

Example:

```bash
jpackage --type exe \
--name LoginScreen \
--input . \
--main-jar LoginScreen.jar \
--main-class LoginScreen \
--app-version 1.0 \
--win-shortcut \
--win-menu
```

This creates a Windows installer that can be used to install the application like a normal desktop program.

## ⚠️ Disclaimer

This is a **learning project** created to practice Java Swing, GUI development, and event handling.

It is not intended to be used as a production-ready authentication system.

## 👨‍💻 Author

**Vivek**

BCA Graduate | Java Learner | Aspiring Software Developer

---

⭐ If you found this project useful, consider giving the repository a star!
