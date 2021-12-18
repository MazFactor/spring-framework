package com.learning.mac.config;

import com.learning.mac.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

	@Bean
	public Book book(){
		Book book = new Book();
		book.setId(1L);
		book.setName("《Java编程思想》");
		book.setPrice(54.0);
		return book;
	}
}
