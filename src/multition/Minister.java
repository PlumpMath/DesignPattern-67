package multition;

/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *         大臣们悲惨了，一个皇帝都伺候不过来了，现在还来了两个皇帝,TND,不管了，找到皇帝，磕头，请安就成了！
 */
public class Minister {
	public static void main(String[] args) {

		// 10个大臣

		int ministerNum = 10;

		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("第" + (i + 1) + "个大臣参拜的是：");
			emperor.emperorInfo();
			System.out.print("\n");
		}

		System.out.print("\n\n\n\n");
		// 有骨气的大臣只参拜某个皇帝
		Emperor emperor2 = Emperor.getInstance(0);
		System.out.print("我是于谦我只认");
		emperor2.emperorInfo();
		System.out.print("是我的主子......");

	}

}
