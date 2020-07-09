package test.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.taa2020.day12.BasicCalculator;

public class TestCalculatorAssertJ {

	@Test
	public void testSubstract(){
		//GIVEN
		BasicCalculator bc = new BasicCalculator(  );

		//WHEN
		int result = bc.substract(6,10);


		//THEN
		assertThat().
	}
}
