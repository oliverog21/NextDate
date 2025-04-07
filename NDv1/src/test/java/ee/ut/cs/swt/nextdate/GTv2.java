package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1988);
	    assertEquals("5/6/1988", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 1866, 1866);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1957);
	    assertEquals("4/5/1957", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(1, 31, 1948);
	    assertEquals("2/1/1948", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(11, 30, 1980);
	    assertEquals("12/1/1980", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(11, 31, 2016);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 310);
	    String string0 = nextDate0.run(0, 310, 310);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1992);
	    assertEquals("3/4/1992", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(2932, 2932, 2932);
	    String string0 = nextDate0.run(2, 29, 2021);
	    assertEquals("2/29/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(8, 30, 1939);
	    assertEquals("8/31/1939", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1817);
	    assertEquals("7/8/1817", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 1854);
	    assertEquals("6/7/1854", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(10, 10, 1992);
	    assertEquals("10/11/1992", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 2005);
	    assertEquals("9/10/2005", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(12, 30, 1944);
	    assertEquals("12/31/1944", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(12, 31, 1948);
	    assertEquals("1/1/1949", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1817);
	    assertEquals("2/3/1817", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2), (-2), (-2));
	    String string0 = nextDate0.run(2, 28, 2000);
	    assertEquals("2/29/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(2, 30, 1980);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1967);
	    assertEquals("3/1/1967", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1018, 1018, 1018);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(763, (-2221), (-1178));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(12, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 31, 31);
	    String string0 = nextDate0.run(31, 31, 31);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2101);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate20() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 2004);
	    assertEquals("2/29/2004", string0);
	}

}