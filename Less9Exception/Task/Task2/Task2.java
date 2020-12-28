import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        try {
            Plant[] plants = {new Plant(15, "BLUE", "ONE"),
                    new Plant(15, "BLUE", "ONE"),
                    new Plant(15, "BLUE", "ONE"),
                    new Plant(15, "BLUE", "ONE"),
                    new Plant(15, "BLE", "ONE"),
                    new Plant(15, "BLUE", "ONE")};
            // Can't get , why it throws an exception in line 9 ?! when its in 13?!
            // Is that cause of array creation in 9 , an it throws exception on creation line?
            // And 2nd question is : when we taking array into try-catch lapse , we can't call it after ? is it normal?
        } catch (TypeExeption typeExeption) {
            typeExeption.printStackTrace();
        } catch (ColourExeption colourExeption) {
            colourExeption.printStackTrace();
        }
        System.out.println("norm");

    }
}
