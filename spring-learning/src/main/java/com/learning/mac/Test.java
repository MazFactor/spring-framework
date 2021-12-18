package com.learning.mac;

import com.learning.mac.config.BookConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) ct.getBean("user");
		user.setId(1L);
		user.setName("张三");
		System.out.println(user);

		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = (Book) annotationContext.getBean("book");
		System.out.println(book);
	}
}
