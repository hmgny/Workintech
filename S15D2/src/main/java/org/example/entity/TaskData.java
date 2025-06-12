package org.example.entity;
import java.util.HashSet;
import java.util.Set;

public class TaskData {
   private Set <Task> annsTasks = new HashSet<>();
   private Set <Task> bobsTasks = new HashSet<>();
   private Set <Task> carolsTasks = new HashSet<>();
   private Set <Task> unassignedTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String assignee){
        switch (assignee.toLowerCase()){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "coral":
                return carolsTasks;
            case "all":
                Set<Task> allTask = new HashSet<>();
                allTask.addAll(annsTasks);
                allTask.addAll(bobsTasks);
                allTask.addAll(carolsTasks);
                return allTask;
            default:
                return new HashSet<>();
        }
    }

    public Set<Task> getUnion(Set<Task> taskSet1, Set<Task> taskSet2) {
        Set<Task> unionSet = new HashSet<>();
        unionSet.addAll(taskSet1);
        unionSet.addAll(taskSet2);

        return unionSet;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2){
        Set<Task> set1Copy = new HashSet<>();
        set1Copy.addAll(set1);
        set1Copy.retainAll(set2);
        return set1Copy;
    }
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2){
        Set<Task> setCopy = new HashSet<>();
        setCopy.addAll(set1);
        setCopy.removeAll(set2);
        return setCopy;
    }
}
