package TaskManegementSystem.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import TaskManegementSystem.Model.Task;

public class TaskRepositoryImpl implements TaskRepository
{
    private static final Map<Integer, Task> taskList = new HashMap<>();

    @Override
    public List<Task> fetchTasks()
    {
        return new ArrayList<>(taskList.values());
    }

     @Override
    public void insertTask(Task task)
    {
       taskList.put(task.getTaskId(), task);
    }

    @Override
    public Task fetchTaskById(int id)
    {
        return taskList.get(id);
    }
}
