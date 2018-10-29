
public class Client {

	public static void main(String[] args) {
		MySingleton singleton1 = MySingleton.getSingleton();
		MySingleton singleton2 = MySingleton.getSingleton();
		System.out.println(singleton1==singleton2);
		singleton1.increment();
		singleton2.increment();
		singleton1.print();
	}

}
