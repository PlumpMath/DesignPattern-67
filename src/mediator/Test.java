package mediator;

/**
 * 中介者模式（Mediator）
 * 
 * @author HL
 */
public class Test {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
