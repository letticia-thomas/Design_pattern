package ChainOfResponsibility;

public abstract class ChainAbstract {
	
	public int level;
	protected ChainAbstract next ;
	public void setNext(ChainAbstract next)
	{
		this.next = next;
	}
	public void doTask(int level)
	{
		if(level==this.level)
		{
			this.write();
		}
		else if(this.next != null)
		{
			next.doTask(level);
		}
	}
	public abstract void write();
	
}
