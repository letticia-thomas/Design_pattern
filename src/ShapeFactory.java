
public class ShapeFactory {
	public Shape getObject(String shape)
	{
		if(shape==" ")
			return null;
		else if(shape =="Circle")
			return new Circle();
		else if(shape =="Rectangle")
			return new Rectangle();
		else if(shape =="Square")
			return new Square();
		return null;
	}
}
