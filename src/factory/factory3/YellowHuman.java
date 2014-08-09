package factory.factory3;

/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *         黄色人类，这个翻译部准确，将就点吧呵呵
 */
public class YellowHuman implements Human {

	@Override
	public void cry() {
		System.out.println("黄色人会哭");

	}

	@Override
	public void laugh() {
		System.out.println("黄色人会大笑，会幸福");

	}

	@Override
	public void talk() {
		System.out.println("黄色人会说话，一般说的都是双字节");

	}

}
