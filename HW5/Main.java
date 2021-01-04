package zero;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, m = 0, tmp, res;
        int[] num1 = new int[10];
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] num2 = {4, 10, 7, 8, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ââåä³òü íîìåð ì³ñÿöÿ:");
        n = sc.nextInt();
//			1)
        if(n <= 12) {
            for(int i = 0; i < monthDays.length; i++) {
                m = monthDays[n - 1];
            }
            System.out.println("Ó öüîìó ì³ñÿö³ " + m + " äí³â (äåíü)");
        } else {
            System.out.println("Íåìàº òàêîãî ì³ñÿöÿ");
        }
//			2)
        System.out.println("Ââåä³òü 10 ÷èñåë:");
        for(int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }

        res = 0;
        for(int i = 0; i < 5; i++) {
            if (num1[i] > 0) {
                res += num1[i];
            } else {
                res = 1;
                for (i = 5; i < num1.length; i++ ) {
                    res = res * num1[i];
                }
            }

        }

        System.out.println("Ðåçóëüòàò: " + res);

        System.out.print("Min: ");

        int min = num2[0];
        for(int i = 0; i < num2.length; i++) {
            if(num2[i] < min) {
                min = num2[i];
            }
        }

        System.out.println(min);

//			4.1)
        Car[] c1 = new Car[4];
        c1[0] = new Car("Peugeot", 2005, 109);
        c1[1] = new Car("BMW", 2010, 330);
        c1[2] = new Car("Ford", 2011, 90);
        c1[3] = new Car("Renault", 2015, 90);

        for(int i = 0; i < c1.length; i++) {
            for(int j = i + 1; j < c1.length; j++) {
                if(c1[i].year < c1[j].year) {
                    tmp = c1[i].year;
                    c1[i].year = c1[j].year;
                    c1[j].year = tmp;
                }
            }
        }
        for(int i = 0; i < c1.length; i++) {
            System.out.println(c1[i].year);
        }
    }



    @Override
    public String toString() {
        return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
