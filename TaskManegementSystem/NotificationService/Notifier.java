package TaskManegementSystem.NotificationService;

import TaskManegementSystem.Enums.TaskEvent;
import TaskManegementSystem.Model.Task;

public interface Notifier 
{
    public void notify(Task task, TaskEvent eventType);
}
