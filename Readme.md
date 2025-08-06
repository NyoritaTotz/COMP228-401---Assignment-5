# COMP228 - Assignment 5: Java Thread Synchronization

## Description

This project is a simulation of a simple banking system implemented in Java using multithreading and thread synchronization.

As part of COMP228 - Java Programming (Section 401) at Centennial College, this assignment demonstrates how to safely manage concurrent access to a shared bank account using the Thread class and synchronized methods.

## Features

- Bank.java – Manages account balance and contains synchronized methods for withdraw() and deposit().
- ThreadWithdrawal.java – A custom thread that performs a withdrawal operation.
- ThreadDeposit.java – A custom thread that performs a deposit operation.
- Main.java – The driver program that creates and manages thread execution.

## Technologies Used

- Java 17+
- Object-Oriented Programming (OOP)
- Java Threads
- Thread Synchronization (synchronized, start(), join())

## Project Structure

```

│
├── Bank.java
├── ThreadWithdrawal.java
├── ThreadDeposit.java
├── Main.java
└── README.md
```

## How It Works

- The Bank starts with a balance of $500.
- 4 withdrawal threads each withdraw $100 (total $400 out).
- 4 deposit threads each deposit $50 (total $200 in).
- Threads are started and run concurrently.
- After all threads complete, the final balance is calculated and printed.

### Expected Output:
```
Initial Balance: $500.0
[...concurrent transactions...]
Final Balance: $300.0
Expected: $300 (500 - 400 + 200)
```

## Demo Video

YouTube Demo: https://youtu.be/5558d6tDZ_o

## GitHub Repository

This repository is publicly available for review and grading.  
Feel free to explore the code and fork it for practice.
