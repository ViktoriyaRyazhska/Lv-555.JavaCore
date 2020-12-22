package PW8;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }
        private Type typeStrToEnum (String type) throws ColorException {
            switch(type.toLowerCase()){
                case "herbs" : return Type.Herbs;
                case "ferns" : return Type.Ferns;
                case "cactus" : return Type.Cactus;
                default : throw new ColorException("Input only type herbs,ferns,cactus");
            }
    }
}