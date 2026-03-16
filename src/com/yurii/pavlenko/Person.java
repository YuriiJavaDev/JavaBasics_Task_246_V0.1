package com.yurii.pavlenko;

/**
 * Representing a club member with smart data management.
 */
public class Person {
    private String memberName;
    private int memberAge;

    /**
     * Initial registration via constructor.
     */
    public Person(String name, int age) {
        this.memberName = name;
        this.memberAge = age;
    }

    // --- GETTERS ---

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    // --- SETTERS ---

    /**
     * Updates the member's name.
     */
    public void setMemberName(String newName) {
        this.memberName = newName;
    }

    /**
     * Updates the member's age with built-in validation.
     */
    public void setMemberAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Age cannot be negative. Value unchanged.");
        } else {
            this.memberAge = newAge;
        }
    }
}