package com.taa2020.day12;

import java.text.DecimalFormat;

public class BasicCalculator {

	private Integer floatingPoint;

	public BasicCalculator() {
		floatingPoint = 10;
	}

	public BasicCalculator( Integer floatingPoint ) {
		this.floatingPoint = floatingPoint;
	}

	public Integer add( Integer... numbers ) {
		Integer sum = 0;
		for ( Integer n : numbers ) {
			sum += n;
		}
		return sum;
	}

	public Integer substract( Integer... numbers ) {
		Integer result = numbers[0];
		for ( int i = 1; i < numbers.length; i++ ) {
			result -= numbers[i];
		}
		return result;
	}

	public Long multiply( Integer... numbers ) {
		Long result = 1L;
		for ( Integer n : numbers ) {
			result *= n;
		}
		return result;
	}

	public Double divide( Integer... numbers ) {
		Double result = numbers[0].doubleValue();
		for ( int i = 1; i < numbers.length; i++ ) {
			if ( numbers[i] == 0 ) {
				throw new IllegalArgumentException( "Number list contains 0. Can't divide by 0" );
			}
			result /= numbers[i];
		}

		return formatDouble( result );
	}

	protected Double formatDouble( Double number ) {
		String pattern = "#.";
		for ( int i = 1; i <= floatingPoint; i++ ) {
			pattern += "0";
		}
		DecimalFormat numberFormat = new DecimalFormat( pattern );
		String formatResult = numberFormat.format( number );
		return Double.parseDouble( formatResult );
	}
}