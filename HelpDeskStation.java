public class HelpDeskStation {
    private final int stationID;
    private final QueueSystem queueSystem;

    public HelpDeskStation(int stationID, QueueSystem queueSystem) {
        this.stationID = stationID;
        this.queueSystem = queueSystem;
    }

    public void serveNextCustomer() {
        int queueNumber = queueSystem.getNextQueueNumber();
        System.out.println("Help Desk " + stationID + " serving customer " + queueNumber);
    }
}
