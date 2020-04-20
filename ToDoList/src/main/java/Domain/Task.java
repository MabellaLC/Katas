package Domain;

import Domain.ValueObjects.IDtask;
import Domain.ValueObjects.TaskName;
import java.util.Objects;

public class Task {
    private IDtask id;
    private TaskName task;
    private String dueDate;
    private String status;  //implementar status
    public boolean isComplete = false;

    public Task(IDtask ID, TaskName task, String dueDate) {
        this.id = ID;
        this.task = task;
        this.dueDate = dueDate;
    }



    public void completeTask() {
       isComplete = true;
    }

    public IDtask getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return id == task1.id &&
                Objects.equals(task, task1.task) &&
                Objects.equals(dueDate, task1.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task, dueDate);
    }

    @Override
    public String toString() {
        return id.toString() + "\n" +
                task.toString() + "\n" +
                "Due: " + dueDate ;
    }
}
