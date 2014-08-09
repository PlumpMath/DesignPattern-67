package strategy2;

/**
 * 
 * @author trygf521@126.com:阿福 这个是锦囊
 */
public class Context {

	private IStrategy strategy;

	// 构造函数，要你使用哪个妙计
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}

}
