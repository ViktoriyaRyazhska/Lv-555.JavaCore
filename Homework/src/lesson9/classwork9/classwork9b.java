package lesson9.classwork9;

import java.util.ArrayList;
import java.util.List;

public class classwork9b {

    public static void main(String[] args) {
        PlantData[] plant_data = {
                new PlantData("cucumber", "blue", 5),
                new PlantData("tulip", "black", 10),
                new PlantData("rose", "red", 15),
                new PlantData("tulip", "white", 20),
                new PlantData("lilia", "blue", 25)
        };

        List<Plant> plants = new ArrayList<>();
        for (PlantData p : plant_data) {
            try {
                plants.add(new Plant(p.type, p.color, p.size));
                System.out.println("Added " + p.size + " cm " + p.color + " " + p.type);
            } catch (ColorException | TypeException e) {
                System.out.println("Unable to create plant: " + e.getMessage());
            }
        }
    }

    /**
     * Plant data used to create Plant instances
     */
    static class PlantData {
        public final String type;
        public final String color;
        public final int size;
        public PlantData(String type, String color, int size) {
            this.type = type;
            this.color = color;
            this.size = size;
        }
    }
};
