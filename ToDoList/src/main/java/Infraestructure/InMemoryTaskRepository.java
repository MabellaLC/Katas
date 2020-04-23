package Infraestructure;

import Domain.Task;
import Domain.TaskRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {

    List<Task> taskList = new ArrayList<>();
    List<Task> incompletTask = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        taskList.add(task);
    }

    @Override
    public List<Task> getList() {
        return taskList;
    }

    @Override
    public List<Task> getListIcompleteTask() {
        for (Task task: taskList){
            if (task.completeTask())
            incompletTask.add(task);
        }
        return incompletTask;
    }
}
