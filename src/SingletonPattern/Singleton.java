package SingletonPattern;

public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getObj()
	{
		return instance;
	}
	public void showMsg()
	{
		System.out.println("Singleton pattern!");
	}
}
