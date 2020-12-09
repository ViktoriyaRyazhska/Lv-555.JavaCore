public class Menu {
    public static void main(String[] args) {
        Dog d1 = new Dog("Brovko" , Breed.layka.toString(), 5);
        Dog d2 = new Dog("Layma" , Breed.taksa.toString(), 10);
        Dog d3 = new Dog("Bobik" , Breed.vivcharka.toString(), 2);

        if(d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName())){
            System.out.println("Є собаки з одинаковим імям");
        } else if (d2.getName().equals(d3.getName())) {
            System.out.println("Є собаки з одинаковим імям");
        } else {
            System.out.println("Собаки з одинаковим імям не має");
        }
        Dog [] dogs = {d1, d2, d3};
        int oldest =  dogs[0].getAge();
        int position = 0;
        for (int i = 1; i < dogs.length; i++){
            if(dogs[i].getAge() > oldest ){
                oldest = dogs[i].getAge();
                position = i;
            }
        }
        System.out.println("Найстарша собака " + dogs[position]);
    }
}
