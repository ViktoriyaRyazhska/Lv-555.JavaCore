public class Main {
    public static void main(String[] args) {
    Product vine = new Product("Vine",150,3);
    Product rum = new Product("Rum",400,5);
    Product coffee = new Product("Coffee",190,4);
    Product penbut = new Product("PeanutButter",40,10);
    Product max = new Product("Maximizer",999,15);
        System.out.println(Product.nameMostExpensive);
        System.out.println(Product.nameMostQuantity);


    }
}
