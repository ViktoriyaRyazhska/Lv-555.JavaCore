import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Bird[] birds = {new Kiwi("Feathers resemble thick fur",2),
            new Penguin("Feathers resemble scales",2),
            new Eagle("Big and brown", 2),
            new Swallow("Bright plumage", 5)};
        for (Bird bird : birds) {
            System.out.println(bird + " " + bird.fly());
        }
        }
    }

