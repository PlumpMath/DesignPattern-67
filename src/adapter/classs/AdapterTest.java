package adapter.classs;

public class AdapterTest {

	/**
	 * 类的适配器模式
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
