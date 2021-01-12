class Product {
    String name;
    double price;
    double quantity;
    static double mostExpensive = 0;
    static double maxNumber = 0;
    static String nameMostExpensive;
    static String nameMostQuantity;
    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        if (price > mostExpensive) {
            this.mostExpensive = price;
            this.nameMostExpensive = "Name of the most expensive: " + name + "\nPrice of the most expensive: " + price;
        }
        if (quantity > maxNumber) {
            this.maxNumber = quantity;
            this.nameMostQuantity = "Name of the items, which has the biggest quantity: " +
                      name;
        }
    }
}



