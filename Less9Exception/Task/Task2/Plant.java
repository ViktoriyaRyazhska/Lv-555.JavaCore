public class Plant {
    private int size;
    private Colour colour;
    private Type type;

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", colour=" + colour +
                ", type=" + type +
                '}';
    }
    public Plant(int size, String colour, String type) throws TypeExeption, ColourExeption  {
        Colour col = colourEnum(colour);
        Type typ = typeEnum(type);
        this.size = size;
        this.colour = col;
        this.type = typ;

    }
    public  Colour colourEnum(String colr) throws ColourExeption {
        switch (colr.toLowerCase()) {
            case "white":
                return Colour.WHITE;
            case "blue":
                return Colour.BLUE;
            case "red":
                return Colour.RED;
            default:
                throw new ColourExeption("Wrong colour.Pick White, Blue or red");
        }
    }
        public Type typeEnum(String typ) throws TypeExeption{
        switch (typ.toLowerCase()){
            case "one": return Type.ONE;
            case "two": return Type.TWO;
            case "three": return Type.THREE;
            default: throw new TypeExeption("Wrong type!.Pick One,Two or Three");
        }
    }
}
