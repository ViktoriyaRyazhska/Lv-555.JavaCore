package HW6;

public class BirdsArr {
    public static void main(String[] args) {
        Bird [] arr = new Bird[4];
        arr[0] = new Chicken("Red", 5);
        arr[1] = new Eagle("Black", 1);
        arr[2] = new Penguin("Blue", 2);
        arr[3] = new Swallow("Brown", 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i].fly();
        }
    }
}
