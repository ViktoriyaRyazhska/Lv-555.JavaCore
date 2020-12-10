package lesson6.homework6a;

public class Homework6a {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, 2),
                new Swallow(true, 3),
                new Penguin(false, 1),
                new Chicken(true, 5),
        };

        for(Bird b: birds){
            b.fly();
            System.out.println(b);
        }
    }
}
