public class Main {
    public static void main(String[] args) {
        Dog donc = new Dog("Ted", 7, Breed.SHARPEI);
        Dog donc1 = new Dog("Tom", 3, Breed.AKITA);
        Dog donc2 = new Dog("Tom", 9, Breed.BULDOG);
        System.out.println(donc1.equals(donc2));
        System.out.println(donc.equals(donc1));
        System.out.println(donc.equals(donc2));

        if (donc1.equals(donc2) || donc.equals(donc1) || donc.equals(donc2)) {
            System.out.println("Few dog's are with the same name");
        } else {
            System.out.println("There's no dog's with the same name ");
        }
        if (donc.getAge() > donc1.getAge() && donc.getAge() > donc2.getAge()) {
            System.out.println("Dog " + donc.getName() + " " +  donc.getBreed() + " is the oldest one");
        } else if (donc1.getAge() > donc.getAge() && donc1.getAge() > donc2.getAge()) {
            System.out.println("Dog " + donc1.getName() + " " +  donc1.getBreed() + " is the oldest one");
        } else {
            System.out.println("Dog " + donc2.getName() + " " + donc2.getBreed() + " is the oldest one");

        }
    }
}


