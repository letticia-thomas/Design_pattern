package ChainOfResponsibility;

public class ErrorLog extends ChainAbstract{
	
	public ErrorLog(int level)
	{
		this.level = level;
	}
	
	public void write()
	{
		System.out.println("Inside the errorlog");
	}
	

}
