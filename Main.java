public class Main {
    public static void main(String[] args) {
        QueueSystem queueSystem = new QueueSystem();

        HelpDeskStation desk1 = new HelpDeskStation(1, queueSystem);
        HelpDeskStation desk2 = new HelpDeskStation(2, queueSystem);
        HelpDeskStation desk3 = new HelpDeskStation(3, queueSystem);

        OnlineMonitoringSystem monitoringSystem = new OnlineMonitoringSystem(queueSystem);

        // Simulate queue operations
        desk1.serveNextCustomer();
        desk2.serveNextCustomer();
        desk3.serveNextCustomer();

        // Display online monitoring system
        monitoringSystem.displayCurrentNumber();

        // Reset the queue
        queueSystem.resetQueue(50);

        // Display updated queue number
        monitoringSystem.displayCurrentNumber();
    }
}
