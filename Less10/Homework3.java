public class Homework3 {
    public static void main(String[] args) {
        Runner runner = new Runner();

//        Thread one = new Thread(new Runnable() {         //В умовах задачі пише створити потік "one" але який сенс ?
//            @Override
//            public void run() {
                runner.startThread2();
//            }
//        });
//        one.start();
    }
}

class Runner {
    public void startThread2() {
        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                Thread three = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Thread 3 ");
                        }
                    }
                });
                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                startThread3(); // Чи краще робити методом також ?
            }
        });
        two.start();
        try {
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//    public void startThread3(){   //  Власне метод
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++){
//                    System.out.println("Thread 3 ");
//                }
//            }
//        });
//        thread3.start();
//    }
//}
