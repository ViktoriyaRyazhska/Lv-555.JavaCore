public class Homework1 {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(),new Swallow(),new Penguin(), new Chicken(), new Kiwi()};
    for(Bird bird : birds){
        bird.fly();
    }
    }
}
