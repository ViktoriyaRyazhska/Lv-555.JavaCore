import java.util.Random;

public class Task9 {
    public void oneOrZero(int value){
        Random rand = new Random();
        for (int i = 0; i < value; i++) {
            if (rand.nextBoolean()){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
