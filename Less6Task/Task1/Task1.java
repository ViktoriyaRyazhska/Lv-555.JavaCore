public class Task1 {
    public static void main(String[] args) {
    Animal[] animals = {new Cat(),new Cat(),new Dog(),new Dog()};
    for (int i =0;i <animals.length; i++ ){
        animals[i].feed();
        animals[i].voice();
    }
    }
}
