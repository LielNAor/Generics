package io.zipcoder.sisyphus;

import org.junit.Assert;
import org.junit.Test;

import io.zipcoder.sisyphus.MyList;

public class MyListTest {
	
	@Test
	public void canAddAnIntegerToArray(){
		Integer expected = 2;
		MyList<Integer> actual = new MyList<Integer>(1);
		actual.add(2);
		Assert.assertEquals(expected, actual.remove());
	}
	
	@Test
	public void canGetAStringFromArray(){
		String expected = "Banana";
		MyList<String> list = new MyList<String>("Banana");
		String actual = list.get(0);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void canSetADoubleInIndex0ArraySize1(){
		Double expected = 2.718;
		MyList<Double> list = new MyList<Double>(3.14);
		list.set(0,2.718);
		Double actual = list.get(0);
		Assert.assertEquals(expected, actual,0.00001);
	}
	
	@Test
	public void cannotSetAFloatInIndex1Arraysize1(){
		Float expected = 3.14f;
		MyList<Float> list = new MyList<Float>(3.14f);
		list.set(1,2.718f);
		Float actual = list.get(0);
		Assert.assertEquals(expected, actual,0.00001);
	}
	
	@Test
	public void canClearAByteList(){
		Byte bYte = 1;
		int expected = 0;
		MyList<Byte> list = new MyList<Byte>(bYte);
		list.clear();
		Assert.assertEquals(expected, list.getListSize());
	}
	
	@Test
	public void isEmptyReturnsTrueAfterClearABooleanList(){
		Boolean bool = false;
		MyList<Boolean> list = new MyList<Boolean>(bool);
		list.clear();
		Assert.assertTrue(list.isEmpty());
	}
	
	@Test
	public void containsReturnsTrueWhenListHasStringZandAskingAboutZ(){
		String z = "z";
		MyList<String> list = new MyList<String>(z);
		Assert.assertTrue(list.contains(z));
	}
	
	@Test
	public void containsReturnsFalseWhenListHasStringAandAskingAboutZ(){
		String a = "A";
		String z = "z";
		MyList<String> list = new MyList<String>(a);
		Assert.assertFalse(list.contains(z));
	}
}
