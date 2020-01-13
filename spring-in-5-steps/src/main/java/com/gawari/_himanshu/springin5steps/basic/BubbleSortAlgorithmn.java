package com.gawari._himanshu.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Qualifier("bubble")
public class BubbleSortAlgorithmn implements SortAlgorithmn {
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
