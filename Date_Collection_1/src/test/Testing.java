package test;

import service.DateDifferenceProvider;

import org.junit.jupiter.api.Test;
import org.junit.*;
import org.junit.Test.*;

import service.DateDifferenceProvider;
import service.support.MyDate;

class Testing {
	DateDifferenceProvider diff;
	@Before
	public void init()
	{
		DateDifferenceProvider diff =new DateDifferenceProvider();
	}
	

	@Test
	public void testGetDateDiff() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(06, 04, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 0);
	}
	
	@Test
	public void testGetDateDiff1() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 04, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 12);
	}
	
	
	@Test
	public void testGetDateDiff3() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 42);
	   
	}
	@Test
	public void testGetDateDiff4() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 73);
	}
	@Test
	public void testGetDateDiff5() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 256);
	}
	@Test
	public void testGetDateDiff6() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012));
	   org.junit.Assert.assertEquals(daysDifference, 622);
	}
	
	
	@Test
	public void testGetDateDiff7() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013));
	   org.junit.Assert.assertEquals(daysDifference, 987);
	}
	@Test
	public void testGetDateDiff8() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113));
	   org.junit.Assert.assertEquals(daysDifference, 37511);
	}
	@Test
	public void testGetDateDiff9() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413));
	   org.junit.Assert.assertEquals(daysDifference, 147084);
	}
	
	@Test
	public void testGetDateDiff10() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813));
	   org.junit.Assert.assertEquals(daysDifference, 293181);
	}
	@Test
	public void testGetDateDiff11() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011));
	   org.junit.Assert.assertEquals(daysDifference, 59);
	}
	@Test
	public void testGetDateDiff12() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012));
	   org.junit.Assert.assertEquals(daysDifference,60);
	}

	
	@Test
	public void testGetDateDiff13() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012));
	   org.junit.Assert.assertEquals(daysDifference,29);
	}
	@Test
	public void testGetDateDiff14() {
	long daysDifference=DateDifferenceProvider.getDateDifference(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012));
	   org.junit.Assert.assertEquals(daysDifference,298);
	}
	@Test
	public void testGetDateDiff15() {
	long daysDifference1=DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012));
	   org.junit.Assert.assertEquals(daysDifference1,304);
	}


	
	
}
