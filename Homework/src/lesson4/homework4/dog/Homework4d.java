package lesson4.homework4.dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Homework4d {
    public static void main(String[] args) throws IOException {

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Lessi", Breed.COLLIE, 5));
        dogs.add(new Dog("Ruff", Breed.DOBERMAN, 6));
        dogs.add(new Dog("Cherry", Breed.SETTER, 7));
        dogs.add(new Dog("Cherry", Breed.BOXER, 2));
        dogs.add(new Dog("Dude", Breed.DALMATIAN, 8));
        dogs.add(new Dog("Lessi", Breed.BULLDOG, 1));

        int oldestDogIndex = 0;
        for (int i= 0; i < (dogs.size()-1); i++ ){
            String dogToCompare = dogs.get(i).getName().toUpperCase();
            for (int j = i + 1; j < dogs.size(); j++){
                if(dogToCompare.equals(dogs.get(j).getName().toUpperCase())){
                    System.out.println("There are at least two dogs with name '" + dogs.get(i).getName() + "'");
                }
            }
            if(dogs.get(i+1).getAge() > dogs.get(i).getAge()){
                oldestDogIndex = i + 1;
            }
        }
        if(dogs.size() > 0) {
            Dog d = dogs.get(oldestDogIndex);
            System.out.println(d.getBreed() + " " + d.getName() + ", age " + d.getAge() + " is the oldest dog");
        }
    }
}
