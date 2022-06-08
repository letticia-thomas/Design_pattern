package SingletonPattern;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton obj = Singleton.getObj();
		obj.showMsg();

	}

}
