
public class MySingleton {
	private static MySingleton singleton = null;
	private int count = 0;
	
	private MySingleton() {}
	
	public static MySingleton getSingleton() {
		if(singleton==null) {
			singleton = new MySingleton();
		}
		return singleton;
	}
	
	public void increment() {
		count++;
	}
	
	public void print() {
		System.out.println(count);
	}
}
