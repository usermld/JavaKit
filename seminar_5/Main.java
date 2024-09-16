package seminar_5;

public class Main {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        int howManyTimesShouldIEat = 3;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Fork[] forks = new Fork[numPhilosophers];
        Thread[] threads = new Thread[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Fork(i);
        }

        for (int i = 0; i < numPhilosophers; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % numPhilosophers];
            philosophers[i] = new Philosopher(i, leftFork, rightFork, howManyTimesShouldIEat);
            threads[i] = new Thread(philosophers[i]);
            threads[i].start();
        }


        try {
            for (int i = 0; i < numPhilosophers; i++) {
                threads[i].join();
                if (!threads[i].isAlive()) {
                    System.out.println("\n Философ " + i + " покушал " + howManyTimesShouldIEat + " раз(а) и наелся !) \n");
                }
            }
            System.out.println("\n Все Философы наелись!) \n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }

