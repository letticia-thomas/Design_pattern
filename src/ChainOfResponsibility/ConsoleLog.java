package ChainOfResponsibility;

public class ConsoleLog extends ChainAbstract{
	public ConsoleLog(int level)
	{
		this.level = level;
	}
	
	public void write()
	{
		System.out.println("Inside the Console log");
	}
}
