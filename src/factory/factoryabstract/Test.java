package factory.factoryabstract;

/**
 * 抽象工厂模式（Abstract Factory）
 * @author HL
 */
public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();

	}

}
