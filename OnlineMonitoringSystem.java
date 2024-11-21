public class OnlineMonitoringSystem {
    private final QueueSystem queueSystem;

    public OnlineMonitoringSystem(QueueSystem queueSystem) {
        this.queueSystem = queueSystem;
    }

    public void displayCurrentNumber() {
        System.out.println("Current queued number: " + queueSystem.getCurrentQueueNumber());
    }
}
