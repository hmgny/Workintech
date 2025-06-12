package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 1000);
        System.out.println("MidDeveloper is handling intermediate tasks. Salary updated to: " + getSalary());
    }
}
