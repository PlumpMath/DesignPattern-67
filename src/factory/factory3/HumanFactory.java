package factory.factory3;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author 阿福(trygf521@126.com)<br>
 *今天讲女娲造人的故事，这个故事大概是这样的：
 *很久很久以前，盘古开辟了天地，用身躯造出日月星辰、山川草木，天地一片繁华，
 *One day,女娲下界走了一遭，哎！太寂寞了，太孤独了，没有会笑的、会哭的
 *会说话的东东，那怎么办呢？
 */
public class HumanFactory {
/**
 * 
 * @param 定义一个烤箱，泥巴进去，人就出来，这个太先进了
 * @return
 */
public static Human createHuman(Class c){
	//定义一个类型的人类
	Human human = null;
	try {//产生一个人类
		human=(Human)Class.forName(c.getName()).newInstance();
	} catch (InstantiationException e) {
		System.out.println("必须指定人类的颜色");
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		System.out.println("人类定义错误");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		System.out.println("混蛋，你定义的人类找不到");
		e.printStackTrace();
	}
	return human;
	
}
/**
 * 女娲生气了，把一团泥巴塞到八卦炉，哎，生产啥人类就啥人类
 * @return
 */
public static Human createHuman(){
	//定义一个类型的人类
	Human human = null;
	//首先是获得有多个事先类，多少个人类
	List<Class> concreteHumanList;
	try {
		concreteHumanList = ClassUtils.getAllClassByInterfalce(Human.class);
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(rand));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return human;
	
}

//定义一个MAP，初始化过的Human对象都放在这里
private static HashMap<String, Human> humans = new HashMap<String, Human>();
/**
 * 用于初始化比较耗时的情况，定义一个烤箱，泥巴塞进去，人就出来，这个太先进了
 * @param c
 * @return
 */
public static Human createHuman2(Class c){
	//定义一个类型的人类
	Human human = null;
	//首先是获得有多个事先类，多少个人类
	if(humans.containsKey(c.getSimpleName())){
		human = humans.get(c.getSimpleName());
	}else{
		try {
			human=(Human)Class.forName(c.getName()).newInstance();
			humans.put(c.getSimpleName(), human);
		} catch (InstantiationException e) {
			System.out.println("必须指定人类的颜色");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("人类定义错误");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("混蛋，你定义的人类找不到");
			e.printStackTrace();
		}
	}
	return human;
	
}

}
