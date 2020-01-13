package com.gawari._himanshu.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gawari._himanshu.springin5steps.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.gawari._himanshu.springin5steps")
public class SpringIn5StepsBasicApplicationNotBoot {

	public static void main(String[] args) {
		/*
		 * BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		 * QuickSortAlgorithmn()); int result = binarySearchImpl.binarySearch(new int[]
		 * { 12, 4, 6 }, 3); System.out.println(result);
		 */

		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringIn5StepsBasicApplicationNotBoot.class, args);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplicationNotBoot.class);
		BinarySearchImpl binarySearchImpl = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = annotationConfigApplicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		int result = binarySearchImpl.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		annotationConfigApplicationContext.close();
	}

}
