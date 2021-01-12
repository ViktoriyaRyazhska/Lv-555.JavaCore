public class Homework2 {
        public static void main(String[] args) {
            int[] arr = {23, 68, 2, 213, 13, -4, 12, 45, 89, 42};
            if (isFirstFivePositive(arr)) {
                System.out.println("Summ: " + arrElementSum(arr));
            } else {
                System.out.println("Product: " + arrElementProd(arr));
            }
        }
        public static boolean isFirstFivePositive(int arr[]) {
            for (int k = 0; k < 5; k++) {
                if (arr[k] < 0) {
                    return false;
                }
            }
            return true;
        }
        public static int arrElementSum(int arr[]) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                    sum += arr[i];
                }
            return sum;
        }
    public static int arrElementProd(int arr[]) {
        int prod = 1;
        for (int i = 5; i < arr.length; i++) {
            prod *= arr[i];
        }
        return prod;
    }
}
