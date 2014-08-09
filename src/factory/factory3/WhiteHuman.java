package factory.factory3;
/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *白色人类
 */
public class WhiteHuman implements Human {

	@Override
	public void cry() {
		System.out.println("白色人会哭");

	}

	@Override
	public void laugh() {
		System.out.println("白色人会笑，侵略的笑");

	}

	@Override
	public void talk() {
		System.out.println("白色人会说话，一般说的都是单字节");

	}

}
