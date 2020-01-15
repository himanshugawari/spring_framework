package com.gawari._himanshu.springin5steps.basic;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.gawari._himanshu.springin5steps.SpringIn5StepsBasicApplication;

//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
class BinarySearchImplTest {

//get bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;

	@Test
	public void testBasicScenario() {
		// call method on binary search
		int res = binarySearchImpl.binarySearch(new int[] {}, 3);

		// check value is correct
		assertEquals(3, res);
	}

}
