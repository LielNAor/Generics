package io.zipcoder.sisyphus;

import org.junit.Assert;
import org.junit.Test;


public class MySetTest {


	@Test
	public void cannotAddInteger2ToSetAgain(){
		int expected = 2;
		MySet<Integer> mySet = new MySet<Integer>(1);
		mySet.add(2);
		mySet.add(2);
		int actual = mySet.getSetSize();
		Assert.assertEquals(expected, actual);
	}
	
}
