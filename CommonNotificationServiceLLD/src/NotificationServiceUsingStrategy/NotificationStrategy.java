package NotificationServiceUsingStrategy;

public interface NotificationStrategy {
    void send(String to, String message);
}

