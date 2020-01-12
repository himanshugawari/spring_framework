package com.gawari._himanshu.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	// @Autowired
	SortAlgorithmn sortAlgorithmn;

	// Constructor Injection
	@Autowired
	public BinarySearchImpl(SortAlgorithmn sortAlgorithmn) {
		super();
		this.sortAlgorithmn = sortAlgorithmn;
	}

	// Setter Injection
	/*
	 * @Autowired public void setSortAlgorithmn(SortAlgorithmn sortAlgorithmn) {
	 * this.sortAlgorithmn = sortAlgorithmn; }
	 */

	public int binarySearch(int[] numbers, int numberToSearch) {
		// BubbleSortAlgorithmn algorithmn=new BubbleSortAlgorithmn();
		// int[] sortedNumbers = algorithmn.sort(numbers);
		int[] sortedNumbers = sortAlgorithmn.sort(numbers);
		System.out.println(sortAlgorithmn);
		return 3;
	}

}
