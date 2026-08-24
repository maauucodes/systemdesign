package TaskManegementSystem.NotificationService;

import java.util.List;

import TaskManegementSystem.Enums.TaskEvent;
import TaskManegementSystem.Model.Task;

public class NotificationService 
{
    private final List<Notifier> notifiers;
    
    public NotificationService(List<Notifier> notifier)
    {
        this.notifiers=notifier;
    }

    public void notifyNotifiers(Task task, TaskEvent eventType)
    {
        for(int i=0;i<notifiers.size();i++)
        {
            notifiers.get(i).notify(task, eventType);
        }
        return;
    }
}
