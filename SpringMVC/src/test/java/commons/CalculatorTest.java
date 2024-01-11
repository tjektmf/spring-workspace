package commons;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	// src/main/java 에 있는 Calculator 패키지를
	// src/test/java 에 있는 CalculatorTest 에서 불러옴
	Calculator calculator = new Calculator();
	
	// @Test 붙여줘야함 
	@Test
	public void test1() {
		// assertEquals(expect, actual) : 기대하는 값이 나오면 성공 아니면 실패
		assertEquals(5, calculator.diff(15, 10)); 
	}
	
	@Test
	public void test2() {
		// assertEquals(expect, actual) : 기대하는 값이 나오면 성공 아니면 실패
		assertEquals(5, calculator.diff(10, 15)); 
	}

}
