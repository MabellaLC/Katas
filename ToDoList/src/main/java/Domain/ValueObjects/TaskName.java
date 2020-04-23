package Domain.ValueObjects;

import Exceptions.TaskFormat;

import java.util.regex.Pattern;

public class TaskName {
    private String taskName;

    public TaskName(String taskName) {
        this.taskName = checkTaskFormat(taskName);
    }

    private String checkTaskFormat(String task){
        if (task.length() < 5){
            throw new TaskFormat("Task format: more than 5 chars");
        }
        if (task.length() > 20){
            throw new TaskFormat("Task format: less than 20 chars");
        }
        if (Pattern.matches("^[a-zA-Z]*$", task)){
            throw new TaskFormat("Task format: only alphabetical");
        }

        return task;
    }

    @Override
    public String toString() {
        return "Task: " + taskName;
    }
}
