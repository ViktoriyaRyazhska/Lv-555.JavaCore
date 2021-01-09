import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Homework2 {
    public static void main(String[] args) {
        Runner runner = new Runner();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstAction();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondAction();
            }
        });
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runner.thirdAction();
    }
}

class Runner {
    private Cards debitCard = new Cards();
    private Cards creditCard = new Cards();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void locker(Lock lock1, Lock lock2) {
        boolean islocked1 = false;
        boolean islocked2 = false;
            while (true) {
        try {
            islocked1 = lock1.tryLock();
            islocked2 = lock2.tryLock();
        } finally {
            if (islocked1 && islocked2) {
                    return;
                }
                if (islocked1) {
                    lock1.unlock();
                }
                if (islocked2) {
                    lock2.unlock();
                }
            }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public void firstAction() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
//            lock1.lock();  // Deadlock
//            lock2.lock();
            locker(lock1, lock2); // !!Avoid locks
            try {
                Cards.transfer(debitCard, creditCard, random.nextInt(100));
            } finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }
    public void secondAction() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
//            lock2.lock(); //Deadlock
//            lock1.lock();
            locker(lock2, lock1);  // !!Avoid locks
            try {
                Cards.transfer(creditCard, debitCard, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void thirdAction() {
        System.out.println(debitCard.getBalance());
        System.out.println(creditCard.getBalance());
        System.out.println(debitCard.getBalance() + creditCard.getBalance());
    }
}

class Cards {
    private int card = 25000;

    public void deposit(int amount) {
        card += amount;
    }

    public void windrow(int amount) {
        card -= amount;
    }

    public int getBalance() {
        return card;
    }

    public static void transfer(Cards one, Cards two, int x) {
        one.windrow(x);
        two.deposit(x);
    }
}



