package lesson9.classwork9;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(String type, String color, int size)   throws ColorException, TypeException {
        this.size = size;
        this.color = colorStrToEnum(color);
        this.type = typeStrToEnum(type);
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "lilia" : return Type.Lilia;
            case "rose" : return Type.Rose;
            case "tulip" : return Type.Tulip;
            default : throw new TypeException("Input only type lilia, rose, tulip");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
