
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		String shape = new String();
		Shape fig;
		
		// if shape is Circle
		shape = "Circle";
		fig = factory.getObject(shape);
		fig.draw();
		
		// if shape is Circle
		shape = "Rectangle";
		fig = factory.getObject(shape);
		fig.draw();
		
		// if shape is Circle
		shape = "Square";
		fig = factory.getObject(shape);
		fig.draw();
	}

}
