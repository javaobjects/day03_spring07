package spring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){

		//1.加载并且解析applicationContext.xml
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("----------IOC容器加载完成--------------------");
		
		//2.获取工厂中的UserServicw对象了
		Student junKai = (Student)factory.getBean("junKai");
		
		//3.调用方法
		System.out.println(junKai.getSid());
		System.out.println(junKai.getSname());
		System.out.println(junKai.getTelepehone());
		
		System.out.println(junKai.getStuClass());
		
		System.out.println(Arrays.toString(junKai.getHobbies()));
		
		System.out.println(junKai.getScores());
		System.out.println(junKai.getList());
		
		System.out.println(junKai.getCourses());
		System.out.println(junKai.getSet());
		
		System.out.println(junKai.getCourseAndScoreMap());
		
		System.out.println(junKai.getProperties());
	}

}
