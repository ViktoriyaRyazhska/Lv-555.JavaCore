public class Car {
    private String type;
    private int productionYear;
    private double engineCapacity;

    public Car(String type, int productionYear, double engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}

