package factory2;

/**
 * 静态工厂方法模式
 * 
 * @author HL
 */
public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
