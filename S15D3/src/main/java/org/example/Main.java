package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee( 1,"Merve", "Yılmaz"));
        employeeList.add(new Employee( 2,"Aykut", "Kaya"));
        employeeList.add(new Employee( 3,"Ege", "Akın"));
        employeeList.add(new Employee(4,"Merve", "Yılmaz"));
        employeeList.add(new Employee(5,"Irmak", "Demir"));
        employeeList.add(new Employee(6,"Aykut", "Kaya"));


    List<Employee> duplicates = findDuplicates(employeeList);
        System.out.println("Duplicates: " + duplicates);
    Map<Integer, Employee> uniques = findUniques(employeeList);
        System.out.println("Uniques: " + uniques.values());
    List<Employee> noDuplicates = removeDuplicates(employeeList);
        System.out.println("Without Duplicates: " + noDuplicates);
}
public static List<Employee> findDuplicates(List<Employee> employees) {
    List<Employee> duplicates = new ArrayList<>();
    Set<Employee> seen = new HashSet<>();
    for (Employee employee : employees) {
        if (!seen.add(employee)) {
            duplicates.add(employee);
        }
    }
    return duplicates;
}
public static Map<Integer, Employee> findUniques(List<Employee> employees){
    Map<Integer, Employee> uniques = new HashMap<>();
    Map<Integer, Integer> frequency = new HashMap<>();
    for (Employee employee : employees) {
        if (employee != null) {
            frequency.put(employee.getId(), frequency.getOrDefault(employee.getId(), 0) + 1);
        }
    }
    for (Employee employee : employees) {
        if (employee != null && (frequency.get(employee.getId()) == 1 || !uniques.containsKey(employee.getId()))) {
            uniques.put(employee.getId(), employee);
        }
    }
    return uniques;
}
public static List<Employee> removeDuplicates(List<Employee> employees) {
    Map<Integer, Integer> frequency = new HashMap<>();
    List<Employee> result = new LinkedList<>();
    for (Employee employee : employees) {
        if (employee != null) {
            frequency.put(employee.getId(), frequency.getOrDefault(employee.getId(), 0) + 1);
        }
    }
    for (Employee employee : employees) {
        if (employee != null && frequency.get(employee.getId()) == 1) {
            result.add(employee);
        }
    }
    return result;
}
}