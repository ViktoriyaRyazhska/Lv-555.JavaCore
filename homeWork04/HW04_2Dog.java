package firstPac;

public class HW04_2Dog {

	public static void main(String[] args) {
		
		DOG dog1 = new DOG("Tom", BREED.SHPITZ, 1);
        DOG dog2 = new DOG("Bones", BREED.BOXER, 3);
        DOG dog3 = new DOG("Bones", BREED.DOBERMAN, 5);
        
        if (dog1.name.equals(dog2.name) || dog1.name.equals(dog3.name) || dog2.name.equals(dog3.name)) {
            System.out.println("Two dog's have the same names"); } 
        
        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            System.out.println(dog1.breed + " " + dog1.name + " is the oldest dog");
        } else { if (dog2.age > dog3.age) {
            System.out.println(dog2.breed + " " + dog2.name + " is the oldest dog");
        } else {
            System.out.println(dog3.breed + " " + dog3.name + " is the oldest dog");}}
        
        if (dog1.age < dog2.age && dog1.age < dog3.age) {
            System.out.println(dog1.breed + " " + dog1.name + " is the youngest dog");
        } else { if (dog2.age < dog3.age) {
            System.out.println(dog2.breed + " " + dog2.name + " is the youngest dog");
        } else {
            System.out.println(dog3.breed + " " + dog3.name + " is the youngest dog");}}
        
	}
}

class DOG{
	String name;
	BREED breed;
	int age;
	
	DOG(String name, BREED breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
	}
}

enum BREED {
    SHPITZ, BOXER, DOBERMAN;}