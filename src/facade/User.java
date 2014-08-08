package facade;

/**
 * 外观模式（Facade）
 * 
 * @author HL
 * 
 */
public class User {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
