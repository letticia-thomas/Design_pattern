
public class FactoryDemo {
	public static void main(String[] args) {
		String shape = new String();
		ShapeFactory fig = new ShapeFactory();
		Shape obj;
		// if shape is Circle
		shape = "Circle";
		obj=fig.getObj(shape);
		obj.draw();
			
		// if shape is Rectangle
		shape = "Rectangle";
		obj=fig.getObj(shape);
		obj.draw();	
	}
}
