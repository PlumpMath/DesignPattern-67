package factory.factory3;
/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *黑色人类
 */
public class BlackHuman implements Human {

	@Override
	public void cry() {
		System.out.println("黑色人会哭");

	}

	@Override
	public void laugh() {
		System.out.println("黑色人会笑");

	}

	@Override
	public void talk() {
		System.out.println("黑色人会说话，一般说人听不懂");

	}

}
