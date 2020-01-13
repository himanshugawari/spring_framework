package com.gawari._himanshu.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//default is singleton.  prototype is hardcoded.
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	// Field Injection
	// @Autowired
	// @Qualifier("bubble")
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

	/*
	 * @PostConstruct public void postConstrct() { LOGGER.info("postConstruct"); }
	 * 
	 * @PreDestroy public void preDestroy() { LOGGER.info("preDestroy"); }
	 */
}
