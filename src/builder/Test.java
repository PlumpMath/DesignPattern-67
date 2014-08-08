package builder;

/**
 * 建造者模式
 * 
 * @author HL
 * 
 */
public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
