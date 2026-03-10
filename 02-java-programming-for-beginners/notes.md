# Introduction to Java: History and Evolution

## What is Java?

Java is a **high-level, platform-independent programming language**. Its core principle is **WORA — "Write Once, Run Anywhere"**: code written once can run on any device (computers, phones, tablets) without modification, thanks to the JVM.

### Where Java is Used

- **Web applications** — websites and online services (scalability + reliability)
- **Mobile apps** — primary language for Android development
- **Enterprise software** — large-scale business applications handling complex operations and large data volumes

---

## History Timeline

| Year     | Event                                                                                                                                |
| -------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| **1991** | James Gosling and team at Sun Microsystems create **Oak**, intended for TVs and VCRs                                                 |
| **1995** | Oak renamed to **Java** (inspired by Indonesian Java Coffee). Java 1.0 released — gains popularity for ease of learning and security |
| **1998** | **Java 2** released — introduces Swing (GUI toolkit) and Collections Framework                                                       |
| **1999** | **J2EE** (Java 2 Enterprise Edition) launched — tools for large-scale business applications                                          |
| **2006** | Sun Microsystems makes Java **open source** — global community begins contributing                                                   |
| **2010** | **Oracle Corporation acquires Sun Microsystems**, takes over Java development                                                        |

---

## Key Versions and Features

### Java 5 (2004)

- **Generics** — write classes/methods that work with any data type while keeping type safety (e.g., `List<String>` instead of raw `List`)
- **Annotations** — add metadata to code for error checking and documentation (e.g., `@Override`)
- **Enhanced for loop** — simpler iteration over collections (`for (String s : list)`)

### Java 8 (2014)

- **Lambda expressions** — cleaner, more concise code for functional-style programming
- **Stream API** — process collections in a functional, pipeline style (filter, map, reduce)
- **New Date/Time API** — replaced the old, error-prone `Date` and `Calendar` classes

### Java 11 (2018) — LTS Release

- **HTTP Client API** — modern, easier way to send HTTP requests and work with web services
- **New garbage collector** — improved memory management, better performance for large applications

### Java 17 (2021) — LTS Release

- **Pattern matching for `instanceof`** — eliminates boilerplate casting code
- **Sealed classes** — control which classes can extend or implement a class

### Java 23 (2023)

- **Record Patterns** — deconstruct records in pattern matching for cleaner data handling
- **Virtual Threads** — lightweight threads for concurrent programming without complex thread management
- **Foreign Function and Memory API** — better interaction with native code and memory

> **Note:** LTS (Long-Term Support) versions receive extended updates and patches. Java 11, 17, and 21 are LTS releases. Our Task Manager project uses **Java 21 LTS**.

---

## Why Java Matters

| Advantage                   | Explanation                                                   |
| --------------------------- | ------------------------------------------------------------- |
| **Platform independence**   | JVM executes bytecode on any platform                         |
| **Used everywhere**         | Powers LinkedIn, eBay, and countless enterprises and startups |
| **Backwards compatibility** | Programs written in older versions usually run on newer ones  |
| **Strong community**        | Abundant tutorials, forums, and resources                     |
| **Versatile**               | Web, mobile, enterprise, embedded systems                     |
| **Career opportunities**    | Consistently high demand for Java developers                  |

---

## Key Takeaways

1. Java follows the **WORA** principle — write once, run anywhere
2. Created in 1991 as Oak, renamed to Java in 1995, open-sourced in 2006, acquired by Oracle in 2010
3. **Java 8** (lambdas, streams) and **Java 17** (sealed classes, pattern matching) are landmark releases
4. **LTS versions** (11, 17, 21) are the ones used in production — they get long-term security updates
5. Backwards compatibility makes Java reliable for long-term projects

# The Java Ecosystem

## Overview

Java was created by Sun Microsystems in 1995 and is now owned by Oracle. The Java ecosystem is the collection of tools, libraries, frameworks, and platforms that developers use to build applications.

---

## Core Components

### JDK (Java Development Kit)

The primary toolkit for Java developers. Contains three parts:

- **Java Compiler (`javac`)** — converts `.java` source code into platform-independent bytecode (`.class` files)
- **JRE (Java Runtime Environment)** — everything needed to _run_ Java applications (includes JVM + core libraries)
- **Utilities** — command-line tools that assist during development

### JRE (Java Runtime Environment)

Provides what's needed to execute Java applications:

- **JVM (Java Virtual Machine)** — executes bytecode, provides platform independence ("write once, run anywhere")
- **Core Libraries** — essential APIs for I/O, networking, concurrency, etc.

### Relationship

```
JDK (development)
 └── JRE (runtime)
      └── JVM (execution engine)
```

---

## IDEs (Integrated Development Environments)

Software that bundles code editing, debugging, build automation, and project management in one tool.

| IDE               | Notes                                                         |
| ----------------- | ------------------------------------------------------------- |
| **Eclipse**       | Open-source, powerful plugin ecosystem                        |
| **IntelliJ IDEA** | Smart code completion, most popular for professional Java dev |
| **NetBeans**      | Open-source, beginner-friendly interface                      |

---

## Frameworks

### Spring Framework

The dominant framework for enterprise Java applications. Key features:

- **Dependency Injection (DI)** — promotes loosely coupled code by letting the framework manage object creation and wiring
- **Aspect-Oriented Programming (AOP)** — separates cross-cutting concerns (logging, security) from business logic
- **Spring Boot** — simplifies setup with embedded servers and pre-configured defaults
- **Spring MVC** — structured architecture for web applications (Model-View-Controller pattern)

### Hibernate

An ORM (Object-Relational Mapping) framework that automates mapping Java objects to database tables, eliminating manual SQL for basic operations.

---

## Build Tools

Automate compiling, dependency management, and packaging.

| Tool       | Key Feature                                                               |
| ---------- | ------------------------------------------------------------------------- |
| **Maven**  | Standardized build lifecycle, XML-based dependency management (`pom.xml`) |
| **Gradle** | Incremental builds, multi-project support, uses Groovy/Kotlin scripts     |

---

## Application Servers

Environments for deploying and managing Java applications.

| Server            | Use Case                                                          |
| ----------------- | ----------------------------------------------------------------- |
| **Apache Tomcat** | Open-source servlet container, ideal for small-to-medium web apps |
| **JBoss**         | Full Java EE stack, suitable for large-scale enterprise apps      |

---

## Testing Frameworks

| Framework  | Key Feature                                       |
| ---------- | ------------------------------------------------- |
| **JUnit**  | Repeatable tests using annotations and assertions |
| **TestNG** | Data-driven testing, parallel test execution      |

---

## Cloud-Native & Microservices

**Spring Cloud** provides tools for building cloud-native applications including service discovery and configuration management.

---

## Java Across Platforms

### Desktop

- **JavaFX** — modern UI toolkit for rich desktop apps (buttons, tables, charts)
- **Swing** — older but still widely used GUI toolkit, lightweight and customizable

### Mobile (Android)

- Android heavily relies on Java (though Kotlin is now preferred)
- **Android SDK** — tools and APIs for accessing device features (camera, GPS, sensors)
- **Android Studio** — official IDE for Android development
- Many Android libraries are still written in Java

### Embedded Systems

- **Java ME (Micro Edition)** — subset of Java for resource-constrained devices
- **Embedded Java** — Java platforms for embedded hardware (sensors, gateways)

---

## Community & Resources

- **Stack Overflow** — Q&A from experienced developers
- **Oracle Documentation** — official Java reference
- **Meetups & Conferences** — networking and learning opportunities

---

## Key Takeaways

1. **JDK** = development toolkit, **JRE** = runtime, **JVM** = execution engine
2. Spring Framework (especially Spring Boot) dominates enterprise Java
3. Maven and Gradle handle builds and dependencies
4. Hibernate maps Java objects to database tables automatically
5. JUnit is the standard for testing
6. Java works across desktop, mobile, embedded, and cloud platforms

# The Java Virtual Machine, Development Kit, and Runtime Environment Explained

## Overview

Java's versatility comes from three core components: the JVM, JDK, and JRE. Understanding how they relate to each other is fundamental to working with Java.

---

## JVM (Java Virtual Machine)

The engine that makes Java **platform independent**.

**What it does:**

- Takes compiled Java bytecode (`.class` files) and converts it into machine code that the operating system can understand
- This conversion happens via **JIT (Just-In-Time) compilation** — bytecode is translated to native machine code at runtime, not ahead of time
- Manages memory through **garbage collection** — automatically frees memory that's no longer in use, preventing memory leaks

**Analogy:** A translator — your Java code is like a letter written in English, and the JVM translates it into whatever "language" (OS/hardware) the computer speaks.

---

## JDK (Java Development Kit)

The **complete toolbox** for building Java applications.

**Contains:**

- **JRE** (everything needed to run Java programs)
- **Development tools:**
  - `javac` — the Java compiler (converts `.java` → `.class` bytecode)
  - Debuggers
  - Other development utilities
- **Java APIs** — collections of reusable libraries for common tasks

**The development workflow:**

```
Write code (.java file)
       ↓
Compile with javac (part of JDK)
       ↓
Bytecode (.class file)
       ↓
Execute on JVM (runs on any platform)
```

**Analogy:** A carpenter's complete toolbox — contains every tool needed to build, fix, and finish the job.

**When to use:** When you're _developing_ Java applications (writing, compiling, debugging code).

---

## JRE (Java Runtime Environment)

The **runtime environment** for executing Java programs.

**Contains:**

- JVM
- Core libraries
- Other components needed to run Java applications

**Does NOT contain:**

- Compilers (`javac`)
- Debuggers
- Any development tools

**Analogy:** A fully furnished room — ready to live in (run programs), but if you need to build or renovate (write code), you need tools from the JDK.

**When to use:** When you only need to _run_ Java applications, not develop them.

---

## How They Relate

```
┌─────────────────────────────────┐
│           JDK                   │
│  ┌───────────────────────────┐  │
│  │         JRE               │  │
│  │  ┌─────────────────────┐  │  │
│  │  │       JVM           │  │  │
│  │  │  (executes bytecode │  │  │
│  │  │   → machine code)   │  │  │
│  │  └─────────────────────┘  │  │
│  │  + Core Libraries         │  │
│  └───────────────────────────┘  │
│  + javac compiler               │
│  + Debugger                     │
│  + Dev utilities                │
│  + Java APIs                    │
└─────────────────────────────────┘
```

| Component | Purpose                         | Includes                        | Use Case                      |
| --------- | ------------------------------- | ------------------------------- | ----------------------------- |
| **JVM**   | Execute bytecode → machine code | JIT compiler, garbage collector | Runs inside JRE and JDK       |
| **JRE**   | Run Java applications           | JVM + core libraries            | End users running Java apps   |
| **JDK**   | Develop Java applications       | JRE + compiler + dev tools      | Developers building Java apps |

---

## Version Notes

- As of September 2024, the latest stable version is **Java 23**
- JDK, JRE, and JVM versions are aligned (all update together)
- Oracle releases quarterly and critical patch updates
- **In our Task Manager project, we're using JDK 21** (a Long-Term Support version)

---

## Key Takeaways

1. **JVM** converts bytecode to machine code (platform independence) and handles garbage collection
2. **JDK** = JRE + development tools — you need this to _write and compile_ Java
3. **JRE** = JVM + core libraries — you need this to _run_ Java (no compiler included)
4. They nest: JDK contains JRE, which contains JVM
5. As a developer, you install the **JDK** (which includes everything)

# Using Key Java Features

## Overview

Java's design offers a balance between simplicity for beginners and power for experienced developers. Eight key features make the language versatile, secure, and efficient.

---

## 1. Object-Oriented Programming (OOP)

Java uses objects to represent real-world things. Four core OOP concepts:

### Classes and Objects

- A **class** is a blueprint that defines properties (fields) and actions (methods)
- An **object** is a specific instance created from a class

```
Class: Car
  Properties: color, speed, model
  Actions: accelerate(), turn(), stop()

Object: redCorolla (color="red", model="Toyota Corolla")
```

### Inheritance

One class takes features from another, promoting code reuse.

```
Vehicle (has wheels, engine)
   └── Car (inherits from Vehicle, adds car-specific features)
```

### Polymorphism

The same action behaves differently depending on the object.

```
start() → Car: starts engine
start() → Boat: turns on motor
```

### Encapsulation

Keeps internal details private — data can only be changed through controlled methods.

```
Car.engineNumber → private (can't be accessed/changed directly from outside)
```

---

## 2. Platform Independence

- Java code compiles to **bytecode**, not native machine code
- The **JVM** runs bytecode on any operating system
- Write on Windows → run on macOS, Linux, or any platform with a JVM
- This is the **"Write Once, Run Anywhere"** principle

---

## 3. Strong Typing

- Every variable must be declared with a **specific data type** before use
- Type errors are caught at **compile time**, not runtime
- Prevents accidental type mismatches (e.g., assigning a string to an integer variable)
- Results in better code quality and fewer bugs, especially in large applications

```java
int count = 10;      // OK
count = "hello";     // Compile error — can't assign String to int
```

---

## 4. Automatic Memory Management (Garbage Collection)

- Developers don't manage memory manually (no `malloc`/`free` like in C)
- The **JVM's garbage collector** detects objects no longer in use and frees that memory automatically
- Prevents **memory leaks** — e.g., if a user session object is forgotten, the GC eventually reclaims it
- Improves efficiency and reduces memory-related bugs

---

## 5. Multithreading

- Multiple **threads** can run simultaneously within a single program
- Creates efficient, responsive applications

**Example — online banking app:**

- Thread 1: handles user input (UI stays responsive)
- Thread 2: processes transactions in the background
- User doesn't wait for long processes to complete

---

## 6. Comprehensive Standard Library

Java ships with a rich set of pre-built classes and methods covering:

- Networking (HTTP, sockets)
- Data structures (lists, maps, sets)
- File handling (reading/writing files)
- Concurrency utilities
- And much more

This eliminates the need to write common functionality from scratch and accelerates development.

---

## 7. Built-in Security

- **Bytecode verification** — validates code before execution
- **Security manager** — checks permissions before operations run
- Prevents unauthorized access to files, network resources, etc.
- Protects users from malicious code

---

## 8. Versatility Across Domains

| Domain                 | How Java is Used                             |
| ---------------------- | -------------------------------------------- |
| **Web development**    | Spring Framework for robust web applications |
| **Mobile development** | Primary language for Android apps            |
| **Enterprise**         | Large-scale, scalable business applications  |

---

## Current Java Trends

| Trend                            | Details                                                                        |
| -------------------------------- | ------------------------------------------------------------------------------ |
| **Cloud-native & microservices** | Spring Boot and Quarkus frameworks gaining popularity                          |
| **Serverless architecture**      | AWS Lambda, Google Cloud Functions support Java                                |
| **AI & machine learning**        | Libraries like Deep Learning 4J and DJL                                        |
| **Spring evolution**             | Spring Boot 3.0, Spring Native 6.0 — better performance, cloud-native features |
| **Modern IDEs**                  | IntelliJ IDEA, Eclipse, VS Code widely adopted                                 |

---

## Key Takeaways

| Feature               | What It Does                                                           |
| --------------------- | ---------------------------------------------------------------------- |
| OOP                   | Organizes code into objects (inheritance, polymorphism, encapsulation) |
| Platform independence | Run on any system with a JVM                                           |
| Strong typing         | Enforces type checks at compile time                                   |
| Garbage collection    | Automatic memory management, prevents leaks                            |
| Multithreading        | Multiple tasks run simultaneously                                      |
| Standard library      | Pre-built tools for networking, data structures, file I/O              |
| Security              | Bytecode verification, security manager                                |
| Versatility           | Web, mobile, enterprise, cloud, AI                                     |

# Using Conditional Statements

## What Are Conditional Statements?

Conditional statements are questions your program asks while running. Based on the answer (`true` or `false`), the program decides what to do next. They direct your program's flow based on specified conditions.

---

## Types of Conditional Statements

### 1. `if` Statement

Runs a block of code **only if** the condition is true. If false, the block is skipped entirely.

```java
int number = 10;

if (number > 5) {
    System.out.println("The number is greater than 5");
}
// Output: The number is greater than 5
```

### 2. `if-else` Statement

Provides an **alternative action** when the condition is false.

```java
int number = 3;

if (number > 5) {
    System.out.println("The number is greater than 5");
} else {
    System.out.println("The number is not greater than 5");
}
// Output: The number is not greater than 5
```

### 3. `else-if` Statement

Checks **multiple conditions** in sequence. The first condition that evaluates to `true` runs, and the rest are skipped.

```java
int number = 5;

if (number > 5) {
    System.out.println("The number is greater than 5");
} else if (number == 5) {
    System.out.println("The number equals 5");
} else {
    System.out.println("The number is less than 5");
}
// Output: The number equals 5
```

**How it flows:**

1. Is `number > 5`? → No → skip
2. Is `number == 5`? → Yes → print and stop
3. `else` never reached

### 4. `switch` Statement

Checks a **single variable** against multiple values. Cleaner than writing many `if-else` chains for the same variable.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    default:
        System.out.println("Weekend");
}
// Output: Wednesday
```

**Important:**

- Each `case` checks for a specific value
- `break` stops execution from falling through to the next case
- **`default`** is the fallback — runs if no cases match (always include it as good practice)

---

## Nested Conditional Statements

You can place conditional statements **inside** other conditional statements for complex decision logic.

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult");

    if (age >= 65) {
        System.out.println("You are a senior citizen");
    }
} else {
    System.out.println("You are a minor");
}
// Output: You are an adult
// (second message doesn't print because 20 < 65)
```

**Flow:**

1. Is `age >= 18`? → Yes (20 >= 18) → print "You are an adult"
2. Is `age >= 65`? → No (20 < 65) → skip
3. `else` block never reached

---

## When to Use What

| Scenario                                           | Use                    |
| -------------------------------------------------- | ---------------------- |
| Single condition to check                          | `if`                   |
| Two possible outcomes (true/false)                 | `if-else`              |
| Multiple conditions to check in sequence           | `else-if` chain        |
| One variable compared against many specific values | `switch`               |
| Complex multi-level decisions                      | Nested `if` statements |

---

## Key Takeaways

1. **`if`** — runs code when a condition is true
2. **`if-else`** — adds an alternative path when the condition is false
3. **`else-if`** — chains multiple conditions; first true one wins
4. **`switch`** — cleaner way to compare one variable against many values; always include `default`
5. **Nesting** — place conditionals inside conditionals for complex logic
6. Conditions evaluate to **boolean** (`true` or `false`) — that's all Java cares about

# Introduction to Loops in Java

## What Are Loops?

Loops execute a block of code **repeatedly** based on a condition. Instead of writing 10 separate print statements, a loop does it in a few lines. They make code shorter, cleaner, and easier to manage.

Java has three primary loop types: `for`, `while`, and `do-while`.

---

## 1. `for` Loop

Use when the **number of iterations is known** beforehand.

**Structure:** three parts in the parentheses — initialization, condition, increment/decrement.

```java
for (initialization; condition; increment) {
    // code to repeat
}
```

**Example — print 1 to 5:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// Output: 1 2 3 4 5
```

**How it flows:**

1. `int i = 1` — set counter (runs once)
2. `i <= 5` — check condition (before each iteration)
3. Execute the code block
4. `i++` — increment counter (after each iteration)
5. Go back to step 2

---

## 2. `while` Loop

Use when the **number of iterations is NOT known** in advance. Continues as long as the condition is `true`.

```java
while (condition) {
    // code to repeat
}
```

**Example — print 1 to 5:**

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
// Output: 1 2 3 4 5
```

**How it flows:**

1. Check condition first
2. If true → run code block
3. Check condition again
4. Repeat until condition is false

---

## 3. `do-while` Loop

Similar to `while`, but **guarantees at least one execution** — the code block runs first, then the condition is checked.

```java
do {
    // code to repeat (runs at least once)
} while (condition);
```

**Example — print 1 to 5:**

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
// Output: 1 2 3 4 5
```

**Key difference from `while`:** Even if `i` started at 6, the loop body would still execute once before the condition is checked.

---

## Comparison

| Loop       | When to Use                         | Condition Check       | Guaranteed Execution |
| ---------- | ----------------------------------- | --------------------- | -------------------- |
| `for`      | Known number of iterations          | Before each iteration | No                   |
| `while`    | Unknown iterations, condition-based | Before each iteration | No                   |
| `do-while` | Need at least one execution         | After each iteration  | Yes (at least once)  |

---

## Nested Loops

Loops inside loops — useful for multidimensional data (arrays, matrices, tables).

**Example — multiplication table (1–10):**

```java
for (int i = 1; i <= 10; i++) {           // outer loop = rows
    for (int j = 1; j <= 10; j++) {       // inner loop = columns
        System.out.print(i * j + "\t");
    }
    System.out.println();                  // new line after each row
}
```

The inner loop completes **all** its iterations for each single iteration of the outer loop.

---

## Loop Control Statements

### `break` — Exit the loop immediately

Terminates the loop regardless of the condition. Useful when you find what you're looking for.

```java
int[] numbers = {1, 3, 5, 7, 9};

for (int num : numbers) {
    if (num > 5) {
        System.out.println("Found: " + num);
        break;    // exits loop immediately
    }
}
// Output: Found: 7
```

### `continue` — Skip to the next iteration

Skips the rest of the current iteration and moves to the next one.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;    // skip printing 5
    }
    System.out.println(i);
}
// Output: 1 2 3 4 6 7 8 9 10 (5 is skipped)
```

---

## Key Takeaways

1. **`for`** — use when you know how many times to loop
2. **`while`** — use when looping depends on a condition you can't predict
3. **`do-while`** — use when the code must run at least once
4. **Nested loops** — loops inside loops for multi-dimensional work
5. **`break`** — exit the loop early
6. **`continue`** — skip the current iteration, keep looping

# Working with Strings in Java

## What is a String?

A string is a **sequence of characters** — like a line of text. It includes letters, spaces, and punctuation. Think of it like a bead necklace: each bead is a character, the whole necklace is the string.

```java
"Hello, World!"   // 13 characters (space and punctuation count)
```

Strings are essential for handling text: names, messages, user input, etc.

---

## Creating Strings

Two ways:

```java
// 1. String literal (preferred, more efficient)
String greeting = "Hello, World!";

// 2. Using the new keyword (explicitly creates an object)
String greeting = new String("Hello, World!");
```

Both work, but literals are preferred — Java can reuse them from a **string pool** for better memory efficiency.

---

## Common String Operations

### `length()` — Count characters

Returns the total number of characters including spaces.

```java
String text = "Java Programming";
System.out.println(text.length());   // 16
```

### `charAt(index)` — Access a single character

Returns the character at a specific position. **Indexing starts at 0.**

```java
String text = "Java";
System.out.println(text.charAt(0));   // J
System.out.println(text.charAt(3));   // a
```

### Concatenation — Combining strings

Two ways, both produce the same result:

```java
// Using + operator
String result = "Hello" + " " + "World";    // "Hello World"

// Using concat() method
String result = "Hello ".concat("World");    // "Hello World"
```

### `equals()` — Compare strings

Checks if two strings have **identical content**. Case-sensitive.

```java
"Hello".equals("Hello");    // true
"Hello".equals("World");    // false
"Hello".equals("hello");    // false (case-sensitive!)
```

> **Important:** Always use `.equals()` to compare strings in Java, **never** `==`. The `==` operator compares memory references, not content.

### `substring(start, end)` — Extract part of a string

Extracts characters from `start` index up to (but **not including**) `end` index.

```java
String text = "Java Programming";
System.out.println(text.substring(5, 16));   // "Programming"
```

```
Index:  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Char:   J a v a   P r o g r a  m  m  i  n  g
                  ^start               ^end (not included)
```

### `split(delimiter)` — Break a string into pieces

Splits a string into an array based on a delimiter.

```java
String data = "apple,banana,cherry";
String[] fruits = data.split(",");

// fruits[0] = "apple"
// fruits[1] = "banana"
// fruits[2] = "cherry"
```

### `String.join(separator, elements)` — Combine strings with a separator

```java
String result = String.join(", ", "Red", "Green", "Blue");
// "Red, Green, Blue"
```

---

## Strings Are Immutable

Once a string is created, it **cannot be changed**. Any "modification" creates a **new string** — the original stays untouched.

```java
String original = "Hello";
String modified = original + " World";

// original is still "Hello"
// modified is a new string "Hello World"
```

This is an important Java concept — every string operation that seems to "change" a string is actually creating a new one in memory.

---

## Built-in Utility Methods

| Method              | What It Does                                         | Example                                           |
| ------------------- | ---------------------------------------------------- | ------------------------------------------------- |
| `toUpperCase()`     | Converts all letters to uppercase                    | `"hello"` → `"HELLO"`                             |
| `toLowerCase()`     | Converts all letters to lowercase                    | `"HELLO"` → `"hello"`                             |
| `trim()`            | Removes leading and trailing spaces                  | `"  hi  "` → `"hi"`                               |
| `replace(old, new)` | Replaces all occurrences of a character or substring | `"hello"` → `"he77o"` with `.replace("ll", "77")` |

```java
String text = "  Hello, Java!  ";

System.out.println(text.toUpperCase());      // "  HELLO, JAVA!  "
System.out.println(text.toLowerCase());      // "  hello, java!  "
System.out.println(text.trim());             // "Hello, Java!"
System.out.println(text.replace("Java", "World"));  // "  Hello, World!  "
```

---

## Key Takeaways

1. Strings are **sequences of characters** — created with literals (`"text"`) or `new String()`
2. **Indexing starts at 0** — `charAt(0)` gives the first character
3. Use `+` or `concat()` for concatenation
4. **Always use `.equals()`** to compare strings, never `==`
5. `substring(start, end)` — end index is **exclusive** (not included)
6. `split()` breaks strings apart, `String.join()` puts them together
7. **Strings are immutable** — every modification creates a new string
8. Utility methods: `toUpperCase()`, `toLowerCase()`, `trim()`, `replace()`

# Using Packages and Imports

## What is a Package?

A package is a **namespace that organizes related classes and interfaces** into a folder-like structure. Think of it like labeled cabinets in a record office — related files are grouped together.

### Why Packages Matter

| Purpose                    | How It Helps                                                                                          |
| -------------------------- | ----------------------------------------------------------------------------------------------------- |
| **Organization**           | Groups related classes into folders, easier to locate and manage                                      |
| **Prevent name conflicts** | Classes with the same name can exist in different packages (e.g., `com.app.User` and `com.auth.User`) |
| **Access control**         | Some classes can be public, others restricted to package-level visibility                             |

---

## Creating a Package

Add the `package` keyword at the **very top** of your Java file (must be the first statement).

```java
package shapes;

public class Circle {
    private double radius;

    // Constructor — initializes radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method — calculates area
    public double area() {
        return Math.PI * radius * radius;
    }
}
```

### Naming Convention

Use **reverse domain name** to ensure uniqueness:

```
com.example.shapes
com.taskmanager.entity
com.taskmanager.service
```

This is why our Task Manager project uses `com.taskmanager` as the base package — it's the standard Java convention.

---

## Imports

An `import` statement brings classes or packages into your current file so you don't have to type the full package name every time.

### Import a single class

```java
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);     // no need to write shapes.Circle
        System.out.println(c.area());
    }
}
```

### Import all classes from a package (wildcard)

```java
import shapes.*;    // imports every class in the shapes package
```

### Without importing (fully qualified name)

```java
shapes.Circle c = new shapes.Circle(5.0);   // works but verbose
```

---

## Important Built-in Java Packages

### `java.lang` — Core classes (auto-imported, no import needed)

| Class                     | Purpose                                                        |
| ------------------------- | -------------------------------------------------------------- |
| `String`                  | Text manipulation                                              |
| `Math`                    | Mathematical functions (`Math.PI`, `Math.sqrt()`)              |
| `System`                  | Input/output, environment interaction (`System.out.println()`) |
| `Integer`, `Double`, etc. | Wrapper classes for primitive types                            |

> You never write `import java.lang.*;` — Java imports it automatically.

### `java.util` — Collections, data structures, algorithms

| Class                | Purpose                                                |
| -------------------- | ------------------------------------------------------ |
| `ArrayList`          | Resizable array (dynamic list)                         |
| `HashMap`            | Key-value pair data structure                          |
| `Date`               | Managing dates and times (legacy — prefer `java.time`) |
| `List`, `Map`, `Set` | Collection interfaces                                  |

### `java.io` — Input/output and file handling

| Class                          | Purpose                                  |
| ------------------------------ | ---------------------------------------- |
| `File`                         | Manage file paths and directories        |
| `InputStream` / `OutputStream` | Read/write byte streams                  |
| `BufferedReader`               | Efficiently read text from input streams |

### `java.net` — Networking

| Class    | Purpose                     |
| -------- | --------------------------- |
| `Socket` | Client-server communication |
| `URL`    | Represents a web address    |

### `java.sql` — Database connectivity

| Class        | Purpose                          |
| ------------ | -------------------------------- |
| `Connection` | Establishes database connections |
| `Statement`  | Executes SQL commands            |

### `java.time` — Modern date/time API (Java 8+)

| Class           | Purpose                                     |
| --------------- | ------------------------------------------- |
| `LocalDate`     | Date without time zone (e.g., `2024-03-10`) |
| `LocalTime`     | Time without date (e.g., `14:30:00`)        |
| `LocalDateTime` | Both date and time                          |

---

## Best Practices

### Package naming

- Use **reverse domain name** convention (`com.yourcompany.project`)
- Group related classes together
- Keep names short and descriptive

### Import management

- **Import only what you need** — avoid wildcard (`*`) imports in production code
- **Organize imports logically** — most IDEs do this automatically
- **Remove unused imports** — keeps code clean and professional
- Most IDEs (IntelliJ, Eclipse) have a keyboard shortcut to auto-organize imports

---

## Connection to Our Task Manager Project

Our project already uses this structure:

```
package com.taskmanager.entity;      → User.java, Task.java
package com.taskmanager.service;      → business logic
package com.taskmanager.controller;   → REST endpoints
package com.taskmanager.repository;   → database access
```

And imports like:

```java
import jakarta.persistence.*;         → JPA annotations
import java.time.LocalDateTime;       → timestamps
import java.util.List;                → collections
```

---

## Key Takeaways

1. **Packages** organize classes into namespaces using the `package` keyword
2. **Imports** let you use classes without typing full package names
3. Use `import package.ClassName;` for a single class, `import package.*;` for all
4. **`java.lang`** is auto-imported — you never need to import `String`, `Math`, `System`
5. Key packages: `java.util` (collections), `java.io` (files), `java.sql` (databases), `java.time` (dates)
6. **Best practice:** import only what you need, use reverse domain naming, remove unused imports

# Implementing Functions and Methods

## What's the Difference?

|                                    | Function                                                | Method                                          |
| ---------------------------------- | ------------------------------------------------------- | ----------------------------------------------- |
| **Definition**                     | Standalone block of code that performs a task           | A function that belongs to a class              |
| **Tied to a class?**               | No (independent)                                        | Yes (operates on objects of that class)         |
| **Can access instance variables?** | No                                                      | Yes                                             |
| **In practice**                    | Not commonly used in Java (everything lives in classes) | The standard way to write reusable code in Java |

> **Key point:** In Java, since everything must be inside a class, virtually all "functions" are technically methods. The term "function" is used conceptually, but you'll almost always be writing methods.

---

## Anatomy of a Method

```java
returnType methodName(parameters) {
    // code block (logic)
    return value;   // optional — omit if void
}
```

| Part                 | Purpose                                                                    | Example             |
| -------------------- | -------------------------------------------------------------------------- | ------------------- |
| **Return type**      | What type of value the method gives back (`int`, `double`, `String`, etc.) | `int`               |
| **Method name**      | Describes what it does                                                     | `add`               |
| **Parameters**       | Inputs the method accepts (optional)                                       | `(int a, int b)`    |
| **Code block**       | The logic that runs                                                        | `{ return a + b; }` |
| **Return statement** | Sends a value back to the caller (omit for `void`)                         | `return a + b;`     |

---

## Examples

### Simple method — add two numbers

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println(sum);   // 8
    }
}
```

### Method inside a class — using an object

```java
public class Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();    // create an instance
        int result = calc.multiply(4, 5);      // call method on the object
        System.out.println(result);            // 20
    }
}
```

---

## Parameters vs Arguments

These terms are often confused:

- **Parameters** — the variables in the method definition (what it _expects_)
- **Arguments** — the actual values passed when calling the method (what you _give it_)

```java
// "name" and "age" are PARAMETERS
void greet(String name, int age) {
    System.out.println("Hello " + name + ", you are " + age + " years old");
}

// "Alice" and 30 are ARGUMENTS
greet("Alice", 30);
// Output: Hello Alice, you are 30 years old
```

---

## Return Values

The result a method gives back after performing its task. Can be any data type.

```java
public class Rectangle {

    double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        double area = rect.area(4.5, 3.0);
        System.out.println("The area of the rectangle is " + area);
        // Output: The area of the rectangle is 13.5
    }
}
```

---

## `void` Methods

Methods that perform an action but **return nothing**.

```java
void printMessage() {
    System.out.println("Hello World");
    // no return statement needed
}
```

---

## Method Overloading

Define **multiple methods with the same name** but **different parameters**. Java picks the right one based on the arguments you pass.

```java
public class Display {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show(10);            // calls show(int)  → "Number: 10"
        display.show("Hello World"); // calls show(String) → "Text: Hello World"
    }
}
```

Methods are distinguished by their **parameter types and count**, not by return type.

---

## Scope of Identifiers

An **identifier** is a name given to a variable, method, class, etc. **Scope** determines where it can be accessed.

| Scope        | Where It's Accessible                               | Example                                 |
| ------------ | --------------------------------------------------- | --------------------------------------- |
| **Local**    | Only within the method or block where it's declared | Variable inside a method                |
| **Instance** | Throughout the class, tied to an object             | Field declared in a class (no `static`) |
| **Static**   | Throughout the class, belongs to the class itself   | Field declared with `static` keyword    |

```java
public class Example {
    static int classLevel = 10;     // static scope — accessible anywhere in class
    int instanceLevel = 20;         // instance scope — needs an object

    void myMethod() {
        int localVar = 30;          // local scope — only inside this method
    }
}
```

---

## Key Takeaways

1. A **function** is a standalone code block; a **method** is a function tied to a class (in Java, you'll mostly write methods)
2. Methods have a **return type**, **name**, **parameters**, and a **code block**
3. **`void`** means the method returns nothing
4. **Parameters** = what the method expects; **arguments** = what you actually pass
5. **Method overloading** = same name, different parameters — Java picks the right one automatically
6. **Scope** controls where a variable can be accessed: local (method), instance (object), or static (class)
