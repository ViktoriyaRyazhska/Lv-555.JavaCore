public class Menu {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, true),
                new Kiwi(true, true)};

        for (Bird bird: birds){
            bird.fly();
            System.out.println(bird);
        }
    }
}
