package com.gawari._himanshu.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithmn implements SortAlgorithmn {
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
