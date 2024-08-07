package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TaskManager {
    private Vector<String> tasks = new Vector<>();
    private ArrayList<String> arrayListTasks = new ArrayList<>();
    private Stack<Operation> history = new Stack<>();
    private LinkedList<String> linkedListTask= new LinkedList<>();

    public static class Operation{
        private String task, type;

        public Operation(String task, String type) {
            this.task = task;
            this.type = type;
        }
    }

    public void addTask(String task){
        tasks.add(task);
        arrayListTasks.add(task);
        linkedListTask.add(task);
        history.push(new Operation("ADD", task));
    }

    public void deleteTask(String task){
        tasks.remove(task);
        arrayListTasks.remove(task);
        linkedListTask.remove(task);
        history.push(new Operation("DELETE", task));
    }

    public void listTask(){
        System.out.println("Vector Tasks: " + tasks);
        System.out.println("ArrayList Tasks: " + arrayListTasks);
        System.out.println("LinkedList Tasks: " + linkedListTask);
    }

    public void undo(){
        if (!history.isEmpty()){
            Operation lastOperation = history.pop();
            if("ADD".equals(lastOperation.task)){
                tasks.remove(lastOperation.type);
                arrayListTasks.remove(lastOperation.type);
                linkedListTask.remove(lastOperation.type);
            } else if("DELETE".equals(lastOperation.task)){
                tasks.add(lastOperation.type);
                arrayListTasks.add(lastOperation.type);
                linkedListTask.add(lastOperation.type);
            }

        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Task1");
        manager.addTask("Task2");
        manager.addTask("Task3");
        System.out.println("All task");
        manager.listTask();

        manager.deleteTask("Task2");
        System.out.println("After Deletion");
        manager.listTask();

        manager.undo();
        System.out.println("After Undo");
        manager.listTask();

    }
}
