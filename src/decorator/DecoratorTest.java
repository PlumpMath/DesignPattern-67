package decorator;

/**
 * 装饰模式
 * @author HL
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
