package com.gawari._himanshu.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gawari._himanshu.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		/*
		 * BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		 * QuickSortAlgorithmn()); int result = binarySearchImpl.binarySearch(new int[]
		 * { 12, 4, 6 }, 3); System.out.println(result);
		 */

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		int result=binarySearchImpl.binarySearch(new int[] {12, 4,6},3);
		System.out.println(result);
	}

}
