package com.gawari._himanshu.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithmn implements SortAlgorithmn {
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
