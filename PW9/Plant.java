
public class Plant {
	private Type type;
	private Color color;
	private int size;
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
	    Type t = typeStrToEnum(type);
		this.type = t;
		this.color = c;
		this.size = size;
	}

	private Color colorStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "blue" : return Color.Blue; 
	         case "red" : return Color.Red; 
	         case "white" : return Color.White; 
	         default : throw new ColorException("Input only color blue, red or white");
	      }
	   }
	private Type typeStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "rose" : return Type.Rose; 
	         case "marigold" : return Type.Marigold; 
	         case "tulip" : return Type.Tulip; 
	         default : throw new ColorException("Input only color blue, red or white");
	      }
	   }

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	

}
