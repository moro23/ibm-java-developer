# Introduction to OOP & Using Classes and Objects in Java

## What is Object-Oriented Programming?

OOP organizes code around **objects** — things that have characteristics (properties) and can perform actions (methods). Instead of writing procedures step by step, you model real-world entities as objects that interact with each other.

---

## Core Concepts

### Classes and Objects

- A **class** is a blueprint/template that defines what properties and methods an object should have
- An **object** is a specific instance created from that blueprint, with its own unique values

```java
// Class = blueprint
public class Car {
    String color;
    String model;
    int year;

    void displayInfo() {
        System.out.println(model + " (" + year + ") - " + color);
    }
}

// Object = specific instance
Car myCar = new Car();       // declaration + instantiation
myCar.color = "Red";         // initialization
myCar.model = "Toyota Corolla";
myCar.year = 2024;
myCar.displayInfo();         // method call → "Toyota Corolla (2024) - Red"
```

**Creating an object — three steps:**

1. **Declaration** — `Car myCar` creates a reference variable of type Car
2. **Instantiation** — `new Car()` allocates memory and creates the object
3. **Initialization** — assign values to the object's attributes

### Properties (Attributes)

The characteristics of an object — what it _has_.

```java
String color;    // "Red", "Blue", "Black"
int speed;       // 120, 80, 60
String model;    // "Sedan", "SUV", "Sports"
```

### Methods

The actions an object can perform — what it _does_.

```java
void drive() { ... }
void honk() { ... }
void park() { ... }
```

---

## The Four Pillars of OOP

### 1. Inheritance

Create new classes based on existing ones — like a family tree. The new class (subclass/child) inherits properties and methods from the existing class (superclass/parent) and can add or modify features.

Use the **`extends`** keyword.

```java
// Superclass (parent)
public class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Driving...");
    }
}

// Subclass (child) — inherits everything from Car, adds its own features
public class ElectricCar extends Car {
    int batteryLife;     // new property specific to ElectricCar

    void charge() {      // new method specific to ElectricCar
        System.out.println("Charging battery...");
    }
}

// Subclass
public class SportsCar extends Car {
    void boost() {       // unique to SportsCar
        System.out.println("Boosting speed!");
    }
}
```

ElectricCar and SportsCar both inherit `color`, `speed`, and `drive()` from Car, but each adds unique features.

### 2. Encapsulation

Bundling data (properties) and the methods that operate on that data into a single unit (class), while **hiding internal details** and exposing only what's necessary.

**Analogy:** A TV remote — you press buttons (public interface) without knowing how signals are processed internally (private details).

```java
public class Account {
    private String password;       // hidden — can't be accessed directly

    public void setPassword(String pwd) {   // controlled access
        if (pwd.length() >= 8) {
            this.password = pwd;
        }
    }
}
```

### 3. Polymorphism

The same method name behaves differently depending on the object type. "Poly" = many, "morph" = forms.

```java
public class Helicopter {
    void fly() {
        System.out.println("Flying with rotor blades");
    }
}

public class Rocket {
    void fly() {
        System.out.println("Launching with engines into space");
    }
}
```

Same method name (`fly`), completely different behavior based on the object.

### 4. Abstraction

Hiding complex implementation details and showing only the essential features. (Covered more in the abstract modifier section below.)

---

## Access Modifiers

Keywords that control **who can see and use** your classes, methods, and variables. Essential for encapsulation.

| Modifier               | Same Class | Same Package | Subclass (other package) | Everywhere |
| ---------------------- | ---------- | ------------ | ------------------------ | ---------- |
| `public`               | ✅         | ✅           | ✅                       | ✅         |
| `protected`            | ✅         | ✅           | ✅                       | ❌         |
| _default_ (no keyword) | ✅         | ✅           | ❌                       | ❌         |
| `private`              | ✅         | ❌           | ❌                       | ❌         |

### Examples

```java
public class Car {
    public String model;       // accessible from anywhere
    private String color;      // only accessible within this Car class
    protected int year;        // accessible in same package + subclasses
    String engine;             // default — accessible only in same package
}
```

### Rule of thumb

- Make fields **`private`** (encapsulation) and provide public getters/setters
- Make methods **`public`** if they're part of the class's API
- Use **`protected`** when subclasses need access
- Use **default** when access should be limited to the same package

---

## Non-Access Modifiers

Keywords that affect **behavior** without changing visibility.

### `static` — belongs to the class, not to instances

Shared across all objects. Accessed without creating an instance.

```java
public class Car {
    static int totalCars = 0;   // shared by ALL Car objects

    public Car() {
        totalCars++;            // increments for every new car created
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(Car.totalCars);   // 2 — accessed via class name
    }
}
```

### `final` — cannot be changed

- **`final` variable** — value cannot be reassigned
- **`final` method** — cannot be overridden by subclasses
- **`final` class** — cannot be extended (no subclasses)

```java
public final class Vehicle {           // cannot be subclassed
    final int MAX_SPEED = 200;         // cannot be changed

    final void start() {               // cannot be overridden
        System.out.println("Starting...");
    }
}
```

### `abstract` — incomplete, must be finished by subclasses

- **`abstract` class** — cannot be instantiated directly, must be extended
- **`abstract` method** — has no body, subclasses must provide the implementation

```java
// Cannot create a Shape object directly
public abstract class Shape {
    abstract void draw();    // no body — subclasses must implement this
}

// Subclass provides the implementation
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Usage
Shape s = new Circle();   // OK — Circle is concrete
s.draw();                 // "Drawing a circle"
// Shape s2 = new Shape();  // ERROR — can't instantiate abstract class
```

---

## Real-World Example: Online Bookstore

```java
// Base class
public class Book {
    String title;
    String author;
    double price;

    void displayInfo() {
        System.out.println(title + " by " + author + " - $" + price);
    }

    void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }
}

// Inheritance — EBook extends Book
public class EBook extends Book {
    String fileFormat;    // additional property (PDF, EPUB, etc.)
}

// Encapsulation — protect sensitive data
public class Customer {
    String name;
    String email;
    private String password;    // hidden from outside

    public void createAccount(String pwd) {
        this.password = pwd;
    }
}

// Polymorphism — same interface, different behavior
public interface PaymentMethod {
    void pay(double amount);
}

public class CreditPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with credit card");
    }
}

public class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}
```

---

## Key Takeaways

1. **Class** = blueprint; **Object** = instance created from that blueprint
2. **Properties** = what an object has; **Methods** = what an object does
3. **Inheritance** (`extends`) — build new classes from existing ones
4. **Encapsulation** — hide internals, expose only what's needed (use `private` + getters/setters)
5. **Polymorphism** — same method name, different behavior depending on object type
6. **Access modifiers:** `public` (everywhere), `private` (same class only), `protected` (package + subclasses), default (package only)
7. **Non-access modifiers:** `static` (belongs to class), `final` (can't change), `abstract` (must be implemented by subclass)
