# 🧮 BMI Calculator — Java

A simple, beginner-friendly **Body Mass Index (BMI) Calculator** built with Java. Run it in your terminal, input your weight and height, and instantly get your BMI along with a health category.

---

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [BMI Categories](#bmi-categories)
- [Tech Stack](#tech-stack)

---

## About

This is a console-based Java application that calculates your BMI using the standard formula:

$$BMI = \frac{weight\ (kg)}{height\ (m)^2}$$

It then classifies the result into one of four health categories.

---

## ✨ Features

- Accepts user input for weight (kg) and height (m)
- Calculates BMI using `Math.pow()`
- Displays BMI rounded to **2 decimal places**
- Categorizes result as: Underweight, Healthy, Overweight, or Obese

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) **8 or higher**
- A terminal / command prompt

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ClydeCenteno1/BMI-Calculator-Java.git
   cd BMI-Calculator-Java
   ```

2. **Compile the program**
   ```bash
   javac Main.java
   ```

3. **Run the program**
   ```bash
   java Main
   ```

---

## 💻 Usage

```
BMI Calculator
Input your weight: 70
Input your height (in meters): 1.75

Your BMI is 22.86

BMI Categories
You are healthy
```

---

## 📊 BMI Categories

| BMI Range       | Category     |
|-----------------|--------------|
| ≤ 18.5          | Underweight  |
| 18.5 – 24.9     | Healthy      |
| 25.0 – 29.9     | Overweight   |
| ≥ 30.0          | Obese        |

---

## 🛠 Tech Stack

- **Language:** Java
- **Input Handling:** `java.util.Scanner`

---

## 👤 Author

**Clyde Centeno**
- GitHub: [@ClydeCenteno1](https://github.com/ClydeCenteno1)
