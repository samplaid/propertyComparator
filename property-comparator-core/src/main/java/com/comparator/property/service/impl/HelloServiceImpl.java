/**
 * 
 */
package com.comparator.property.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.comparator.property.service.HelloService;

/**
 * @author xqv66
 *
 */
@Component
public class HelloServiceImpl implements HelloService {

	public String sayHello() {
		return "Hello";
	}

	@PostConstruct
	void postConstruct() {
		System.out.println("tesssssssssssssssssssssssssssssssss");
	}
}
