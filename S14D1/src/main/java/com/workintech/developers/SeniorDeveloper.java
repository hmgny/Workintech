package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 2000);
        System.out.println("SeniorDeveloper is solving complex problems. Salary updated to: " + getSalary());
    }
}
