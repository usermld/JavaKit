package seminar_5;

public class Philosopher implements Runnable{
    
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;
    private final int howManyTimesShouldIEat;
    private int eatCount = 0;


    public Philosopher(int id, Fork leftFork, Fork rightFork,int howManyTimesShouldIEat) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.howManyTimesShouldIEat = howManyTimesShouldIEat;
    }

    private void think() {
        System.out.println("Философ " + id + " думает.");
        try {
            Thread.sleep(((int) (Math.random() * 100)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void eat() {
        System.out.println("Философ " + id + " кушает.");
        try {
            Thread.sleep(((int) (Math.random() * 100)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void pickUpForks() throws InterruptedException {
        synchronized (leftFork) {
            leftFork.pickUp();
            System.out.println("Философ " + id + " взял левую вилку " + leftFork.getId());
            synchronized (rightFork) {
                rightFork.pickUp();
                System.out.println("Философ " + id + " взял правую вилку " + rightFork.getId());
            }
        }
    }

    private void putDownForks() {
        synchronized (leftFork) {
            synchronized (rightFork) {
                leftFork.putDown();
                rightFork.putDown();
                System.out.println("Философ " + id + " положил вилки " + leftFork.getId() + " и " + rightFork.getId());
            }
        }
    }

    @Override
    public void run() {
        while (eatCount < howManyTimesShouldIEat) {
            think();
            try {
                pickUpForks();
                eat();
                putDownForks();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            eatCount++;
        }
    }
}
