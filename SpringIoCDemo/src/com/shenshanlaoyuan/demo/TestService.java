package com.shenshanlaoyuan.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * @author shenshanlaoyuan
 *
 */
public class TestService {
	//原来的方式
	@Test
	public void testSayHello1(){
		UserServiceImpl usi = new UserServiceImpl();
		usi.sayHello();
	}
	//spring方式
	@Test
	public void testSayHello2(){
		//创建工厂，加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从工厂中获取到对象
		UserService us = (UserService) ac.getBean("userService");
		//调用对象的方法
		us.sayHello();
	}
}
