package observer;

/**
 * 观察者模式（Observer）
 * 
 * @author HL
 * 
 * 将观察者add到集合。subject更新时遍历观察者更新。
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}

}
