# Exclusive Club: The Smart Setter (JavaBasics_Task_246_V0.1)

## 📖 Description
Raw data access is dangerous. This project demonstrates the ultimate goal of **Encapsulation**: protecting the object's state from invalid data. By implementing **Setters with Validation**, we ensure that a `Person` can never have a negative age. The object now possesses "self-awareness" and "self-protection" logic, rejecting incorrect inputs and maintaining data integrity throughout its lifecycle.

## 📋 Requirements Compliance
- **Input Validation**: Added logic to `setMemberAge()` to reject negative values.
- **Feedback Mechanism**: Implemented an error message for failed validation attempts.
- **Controlled Modification**: Used `setMemberName()` to allow safe name updates.
- **Architecture**: Separated validation logic from the presentation and entry point.

## 🚀 Architectural Stack
- Java 8+ (Encapsulation, Setters, Conditional Logic)

## 🏗️ Implementation Details

- **Person**: The Model. Now contains the "Business Rules" for member data.
- **SolutionApp**: The Entry Point. Tests both failed (negative age) and successful data updates.

## 📋 Expected result
```text
Error: Age cannot be negative. Value unchanged.
Still 25 years old.
Now 35 years old.
```

## 💻 Code Example

Project Structure:

    JavaBasics_Task_246/
    ├── src/
    │   └── com/yurii/pavlenko/
    │                  ├── Person.java   (Model with Smart Setters)
    │                  └── Solution.java (Entry Point & Testing)
    └── README.md

Code
```java
package com.yurii.pavlenko;

public class SolutionApp {

    public static void main(String[] args) {

        Person person = new Person("Greg", 25);

        person.setMemberAge(-5);
        System.out.println("Still " + person.getMemberAge() + " years old.");

        person.setMemberAge(35);
        System.out.println("Now " + person.getMemberAge() + " years old.");
    }
}
```
```java
package com.yurii.pavlenko;

public class Person {
    private String memberName;
    private int memberAge;

    public Person(String name, int age) {
        this.memberName = name;
        this.memberAge = age;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberName(String newName) {
        this.memberName = newName;
    }

    public void setMemberAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Age cannot be negative. Value unchanged.");
        } else {
            this.memberAge = newAge;
        }
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
