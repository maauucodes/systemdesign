package TaskManegementSystem.Repository;

import java.util.List;

import TaskManegementSystem.Model.Task;

public interface TaskRepository 
{
    public List<Task> fetchTasks();
    public void insertTask(Task task);
    public Task fetchTaskById(int id);
}
