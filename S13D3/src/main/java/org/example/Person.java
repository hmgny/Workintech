package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    String gender;
    int length;
    int weight;

    public Person(String firstname, String lastName, int age ){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstname, String lastName, int age, String gender, int length, int weight ){
        this(firstname, lastName, age);
        this.gender = gender;
        this.length = length;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if(age>=13 && age<=19 ) {
            return true;
        } else {
            return false;
        }
    }
}
