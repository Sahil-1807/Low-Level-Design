package NotificationServiceUsingFactory;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {
    private Map<String, Notification> notificationStrategies;

    public NotificationService() {
        notificationStrategies = new HashMap<>();
    }

    // Register notification types (Extensible)
    public void registerNotification(String type, Notification notification) {
        notificationStrategies.put(type.toLowerCase(), notification);
    }

    // Send a notification
    public void sendNotification(String type, String to, String message) {
        Notification notification = notificationStrategies.get(type.toLowerCase());
        if (notification != null) {
            notification.send(to, message);
        } else {
            throw new IllegalArgumentException("Notification type not registered");
        }
    }
}
