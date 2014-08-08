package adapter.object;

public class AdapterTest {

	/**
	 * 对象的适配器模式
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}

}
