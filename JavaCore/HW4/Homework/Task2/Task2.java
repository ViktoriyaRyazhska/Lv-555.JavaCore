public class Task2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Didi", Dog.Breed.Affenpinscher, 5);
        Dog dog2 = new Dog("Jack", Dog.Breed.Afghan_Hound, 4);
        Dog dog3 = new Dog("Jack", Dog.Breed.Akita, 3);

        if(dog1.getName().equalsIgnoreCase(dog2.getName())){
            System.out.println(dog1.getBreed() + " " + dog2.getBreed() + " have same name");
        }else if(dog1.getName().equalsIgnoreCase(dog3.getName())){
            System.out.println(dog1.getBreed() + " " + dog2.getBreed() + " have same name");
        }else if(dog2.getName().equalsIgnoreCase(dog3.getName())){
            System.out.println(dog2.getBreed() + " " + dog3.getBreed() + " have same name");
        }else{
            System.out.println("No dogs with same name");
        }
        if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
            System.out.println(dog1.getName() + " " + dog1.getBreed() + "is oldest");
        } else if ((dog2.getAge() > dog3.getAge())) {
            System.out.println(dog2.getName() + " " + dog2.getBreed() + "is oldest");
        }  else {
            System.out.println(dog3.getName() + " " + dog3.getBreed() + "is oldest");
        }
    }
}
