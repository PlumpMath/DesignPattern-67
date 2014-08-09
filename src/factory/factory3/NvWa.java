package factory.factory3;
/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *首先定义女娲，这真是我的神呀
 */
public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//女娲第一次造人，实验性质，少造点，火候不足，缺陷产品
		System.out.println("------造出的第一批人是这样的：白人------");
		Human whiteHuman = HumanFactory.createHuman2(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		
		
		
		//女娲第 二次造人，火候加足点，然后出了个次品，黑人
		System.out.println("\n\n------造出的第 二批人是这样的：黑人------");
		Human blackHuman = HumanFactory.createHuman2(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		
		//女娲造第 三批人了，火候掌握刚刚好，然后出了优秀品种，黄色人
		System.out.println("\n\n------造出的第三批人是这样人的：黄色人类------");
		Human yellowHuman = HumanFactory.createHuman2(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();
		
		
//		//女娲烦躁了，爱是啥人类就是什么人类呗，烧吧
//		System.out.println("\n\n------随机产生人类了------");
//		for(int i=0;i<100;i++){
//			Human randomHuman = HumanFactory.createHuman();
//			randomHuman.cry();
//			randomHuman.laugh();
//			randomHuman.talk();
		// }

	}

}
