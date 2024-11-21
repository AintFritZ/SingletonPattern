public class QueueSystem {
    private int currentQueueNumber = 1;

    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    public synchronized void resetQueue(int newStartNumber) {
        currentQueueNumber = newStartNumber;
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber - 1;
    }
}
