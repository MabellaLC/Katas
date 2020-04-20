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
        for (Task task: taskRepository.getListIcompleteTask()) {
            consoleApp.printLine(task.toString());
        }
    }

    //service class
    public void addTask(Task thingTodo) {
        taskRepository.addTask(thingTodo);
    }

    //service class
    public void completeTask(IDtask id){
        for (Task task: taskRepository.getList()) {
            if (task.getID() == id){
                task.completeTask();
            }
        }
    }

/*
    public void executeAction(String command){
        execute(parseCommand(command));
    }

    public void execute(ICommand icommand){
        taskRepository = icommand.execute(taskRepository);
    }

    private ICommand parseCommand(String command){
        if (command.equals("All")) {
            return new All();
        }
        if (command.equals("Incomplete")) {
            return new Incomplete();
        }
        return new UnknownCommand();
    }*/
}
