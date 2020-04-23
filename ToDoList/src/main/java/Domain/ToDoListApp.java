package Domain;

import Domain.ValueObjects.IDtask;
import Exceptions.UnknownCommandEx;

public class ToDoListApp {

    private TaskRepository taskRepository;
    private ConsoleApp consoleApp;

    public ToDoListApp(TaskRepository taskRepository, ConsoleApp console) {
        this.taskRepository = taskRepository;
        this.consoleApp = console;
    }

    public void executeCommand(String command){
        if (command == "All") {            
            printTask();
        }
        else if (command == "Incomplete") {
            printTaskForIncomplete();
        }
        else {
            throw new UnknownCommandEx("No es un command");
        }
    }

    public void printTask() {
        for (Task task: taskRepository.getList()) {
            consoleApp.printLine(task.toString());
        }
    }

    private void printTaskForIncomplete() {
        /*for (Task task: taskRepository.getListIcompleteTask()) {
            consoleApp.printLine(task.toString());
        }*/
    }

    //service class
    public void addTask(Task thingTodo) {

        taskRepository.addTask(thingTodo);
    }

    //service class
    public Task completeTask(IDtask id){
        for (Task task: taskRepository.getList()) {
            if (task.getID() == id){
                task.completeTask();
                return task.taskCompleted();
            }
        }
        throw new UnsupportedOperationException("no complete task");
    }


}
