public class Plant {
    private int size;
    private PlantColor color;
    private PlantType type;

    public Plant(int size, String type, String color) throws ColorNullException, TypeNullException {
        PlantColor plantColor = getColor(color);
        PlantType plantType = getType(type);
        this.size = size;
        this.color = plantColor;
        this.type = plantType;
    }


    private PlantColor getColor(String color) throws ColorNullException {
        switch (color.toLowerCase()) {
            case "red":
                return PlantColor.red;
            case "blue":
                return PlantColor.blue;
            case "green":
                return PlantColor.green;
            default:
                throw new ColorNullException("Enter blue, red or green");
        }
    }

    private PlantType getType(String type) throws TypeNullException {
        switch (type.toLowerCase()) {
            case "rose":
                return PlantType.rose;
            case "aloe":
                return PlantType.aloe;
            case "aster":
                return PlantType.aster;
            default:
                throw new TypeNullException("Enter rose, aloe or aster");
        }
    }
}