package com.gawari._himanshu.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		/*
		 * BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		 * QuickSortAlgorithmn()); int result = binarySearchImpl.binarySearch(new int[]
		 * { 12, 4, 6 }, 3); System.out.println(result);
		 */

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearchImpl.binarySearch(new int[] {12, 4,6},3);
		System.out.println(result);
	}

}
