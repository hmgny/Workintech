package com.workintech.developers;
import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee {
    private List<JuniorDeveloper> juniorDevelopers;
    private List<MidDeveloper> midDevelopers;
    private List<SeniorDeveloper> seniorDevelopers;

    public HRManager(int id, String name, double salary){
        super(id,name,salary);
        juniorDevelopers = new ArrayList<>();
        midDevelopers = new ArrayList<>();
        seniorDevelopers = new ArrayList<>();
    }
    @Override
    public void work() {
        System.out.println("HRManager is organizing employee workflows.");
    }

    public void addEmployee(JuniorDeveloper developer) {
        addToDeveloperList(juniorDevelopers, developer);
    }

    public void addEmployee(MidDeveloper developer) {
        addToDeveloperList(midDevelopers, developer);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addToDeveloperList(seniorDevelopers, developer);
    }

    private <T> void addToDeveloperList(List<T> developerList, T developer) {
        if (developerList.contains(developer)) {
            System.out.println("This developer is already in the list.");
            return;
        }
        developerList.add(developer);
        System.out.println("Developer added successfully.");
    }
}
