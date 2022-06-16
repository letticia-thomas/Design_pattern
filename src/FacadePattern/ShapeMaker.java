package FacadePattern;

public class ShapeMaker {
	public Circle c;
	public Rectangle r;
	
	public ShapeMaker()
	{
		c = new Circle();
		r = new Rectangle();
	}
	public void drawCircle()
	{
		c.draw();
	}
	public void drawRectangle()
	{
		r.draw();
	}
}
