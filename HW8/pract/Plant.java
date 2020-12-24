public class Plant {
	private int size;
	private Color color;
	private Type type;
	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color color2 = colorStrToEnum(color);
	    Type type2 = typeStrToEnum(type);
		this.size = size;
		this.color = color2;
		this.type = type2;
	}
	private Color colorStrToEnum(String color2) throws ColorException{
		switch(color2.toLowerCase()){
         	case "red" : return Color.RED; 
         	case "green" : return Color.GREEN; 
         	case "blue" : return Color.BLUE; 
         	default : throw new ColorException("Input only RGB");
		}
	}
	private Type typeStrToEnum(String type2) throws TypeException {
		switch(type2.toLowerCase()){
     	case "type1" : return Type.TYPE1; 
     	case "type2" : return Type.TYPE2; 
     	case "type3" : return Type.TYPE3; 
     	default : throw new TypeException("Input only 3 type");
	}
	}
	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

}