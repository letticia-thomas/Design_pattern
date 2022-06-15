package ChainOfResponsibility;

public class DebugLog extends ChainAbstract{
	public DebugLog(int level)
	{
		this.level = level;
	}
	
	public void write()
	{
		System.out.println("Inside the Debuglog");
	}
}
