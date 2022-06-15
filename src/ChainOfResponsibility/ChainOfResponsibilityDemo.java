package ChainOfResponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		ConsoleLog log1 = new ConsoleLog(1);
		ErrorLog log2 = new ErrorLog(2);
		DebugLog log3 = new DebugLog(3);
		
		log1.setNext(log2);
		log2.setNext(log3);
		
		log1.doTask(2);

	}

}
