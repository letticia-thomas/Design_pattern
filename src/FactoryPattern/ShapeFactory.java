
public class ShapeFactory {
	public Shape getObj(String shape)
	{
		
		if(shape=="")
		{
			return null;
		}
		if(shape == "Circle")
		{
			return new Circle();
		}
		if(shape == "Rectangle")
		{
			return new Rectangle();
		}
		return null;
	}

}
