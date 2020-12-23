public class Main {
    public static void main(String[] args) {

        try {
            Plant[] plants = {
                    new Plant(1, "rose", "red"),
                    new Plant(2, "rose", "red"),
                    new Plant(3, "aster", "blue"),
                    new Plant(4, "aloe", "green"),
                    new Plant(5, "Jacky", "red")
            };
        } catch (ColorNullException | TypeNullException e) {
            System.out.println(e.getMessage());
        }

    }
}









