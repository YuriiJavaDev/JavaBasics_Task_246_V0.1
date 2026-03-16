package com.yurii.pavlenko;

/**
 * Demonstrating data protection through Smart Setters.
 */
public class SolutionApp {

    public static void main(String[] args) {
        // Create a member "Greg", 25 years old
        Person person = new Person("Greg", 25);

        // Attempt to set negative age (-5)
        // This should trigger the error message inside the setter
        person.setMemberAge(-5);
        System.out.println("Still " + person.getMemberAge() + " years old."); // Still 25

        // Set valid age (35)
        person.setMemberAge(35);
        System.out.println("Now " + person.getMemberAge() + " years old."); // Now 35
    }
}