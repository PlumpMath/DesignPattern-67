package singleton2;

/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *         大臣每天参拜皇帝
 */
public class Minister {
	public static void main(String[] args) {
		// 第一天
		Emperor emperor1 = Emperor.getInstance();
		// 第一天见的皇帝叫什么名字呢？
		emperor1.emperorInfo();

		// 第二天
		Emperor emperor2 = Emperor.getInstance();
		// 第二天见的皇帝叫什么名字呢？
		emperor2.emperorInfo();

		// 第三天
		Emperor emperor3 = Emperor.getInstance();
		// 第三天见的皇帝叫什么名字呢？
		emperor3.emperorInfo();

		// 三天见的皇帝都是同一个人，荣幸吧，呵呵。
	}

}
