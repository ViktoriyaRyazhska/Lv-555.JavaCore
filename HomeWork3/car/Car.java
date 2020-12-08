package car;

public class Car {
    private int CarID;
    private String CarModel;
    private String CarRegisterNumber;
    private int CarYearOutput;
    private int CarPrice;
    public Car(int CarID, String CarModel, String CarRegisterNumber, int CarYearOutput, int CarPrice) {
        this.CarID = CarID;
        this.CarModel = CarModel;
        this.CarRegisterNumber = CarRegisterNumber;
        this.CarYearOutput = CarYearOutput;
        this.CarPrice = CarPrice;
    }
    public int getCarID() {
        return CarID;
    }
    public void setCarID(int carID) {
        this.CarID = carID;
    }
    public String getCarModel() {
        return CarModel;
    }
    public void setCarModel(String carModel) {
        this.CarModel = carModel;
    }
    public String getCarRegisterNumber() {
        return CarRegisterNumber;
    }
    public void setCarRegisterNumber(String carRegisterNumber) {
        this.CarRegisterNumber = carRegisterNumber;
    }
    public int getCarYearOutput() {
        return CarYearOutput;
    }
    public void setCarYearOutput(int carYear) {
        this.CarYearOutput = carYear;
    }
    public int getCarPrice() {
        return CarPrice;
    }
    public void setCarPrice(int carPrice) {
        this.CarPrice = carPrice;
    }
    //@Override
    public String toString() {
        return "Car{" +
                CarID +
                ": car name is '" + CarModel + '\'' +
                ", register number is '" + CarRegisterNumber + '\'' +
                ", year of output is " + CarYearOutput +
                ", car price is " + CarPrice +
                '}';
    }
    /**@Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return CarID == car.CarID &&
    CarYearOutput == car.CarYearOutput &&
    CarPrice == car.CarPrice &&
    Objects.equals(CarModel, car.CarModel) &&
    Objects.equals(CarRegisterNumber, car.CarRegisterNumber);
    }
     @Override
     public int hashCode() {
     return Objects.hash(CarID, CarModel, CarRegisterNumber, CarYearOutput, CarPrice);
     }*/
}