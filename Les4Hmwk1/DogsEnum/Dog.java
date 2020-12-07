import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        Dog dog = (Dog) obj;
        return name == dog.name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public Breed getBreed() {
        return breed;
    }
}
