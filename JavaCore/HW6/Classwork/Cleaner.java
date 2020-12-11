public class Cleaner extends Staff {
    final private String TYPE_PERSON = "Cleaner";

    @Override
    public String print() {//цей метод повторюється для кожного конкретного класу. Не придумав як його записати 1 раз для всіх однаково не міняючи абсрактний метод
        return " says: I am a " + TYPE_PERSON;
    }

    public Cleaner(String name){
        super(name);
    }

    @Override
    public int salary() {
        return 500;
    }
}
