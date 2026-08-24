package TaskManegementSystem.NotificationService;

import TaskManegementSystem.Enums.TaskEvent;
import TaskManegementSystem.Model.Task;

public class EmailNotifier implements Notifier
{
    @Override
    public void notify(Task task, TaskEvent eventType)
    {
        System.out.println("Task: " + task + " was " + eventType); // In real applications email API(s) would be called to send out a mail to the required user
    }
}
