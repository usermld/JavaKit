package seminar_5;

public class Fork {
    private final int id;
    private boolean isAvailable = true;

    public Fork(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public synchronized void pickUp() throws InterruptedException {
        while (!isAvailable) {
            wait();
        }
        isAvailable = false;
    }

    public synchronized void putDown() {
        isAvailable = true;
        notifyAll();
    }
}
