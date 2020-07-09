package com.taa2020.day12;

import java.text.DecimalFormat;

public class BasicCalculator {

	private Integer floatinPoint;

	public BasicCalculator() {
		floatinPoint = 10;
	}

	public BasicCalculator( Integer floatinPoint ) {
		this.floatinPoint = floatinPoint;
	}

	//sum integer
	public Integer add( Integer... numbers ) {

		Integer sum = 0;
		for ( Integer n : numbers ) {
			sum += n;
		}
		return sum;
	}

	//sum long
	public Long add( Long... numbers ) {

		Long sum = 0L;
		for ( Long n : numbers ) {
			sum += n;
		}
		return sum;
	}

	//sum double
	public Double add( Double... numbers ) {

		Double sum = 0.0;
		for ( Double n : numbers ) {
			sum += n;
		}
		return sum;
	}

	//substract integer
	public Integer substract( Integer... numbers ) {
		Integer result = numbers[0];
		for ( int i = 1; i < numbers.length; i++ ) {
			result -= numbers[i];
		}
		return result;
	}

	//substract long
	public Long substract( Long... numbers ) {
		Long result = numbers[0];
		for ( int i = 1; i < numbers.length; i++ ) {
			result -= numbers[i];
		}
		return result;
	}

	//substract Double
	public Double substract( Double... numbers ) {
		Double result = numbers[0];
		for ( int i = 1; i < numbers.length; i++ ) {
			result -= numbers[i];
		}
		return result;
	}

	//multiplay Integer
	public Long multiplay( Integer... numbers ) {
		Long result = 1L;
		for ( Integer n : numbers ) {
			result *= n;
		}
		return result;
	}

	//multiplay Integer
	public Long multiplay( Long... numbers ) {
		Long result = 1L;
		for ( Long n : numbers ) {
			result *= n;
		}
		return result;
	}

	//multiplay Double
	public Double multiplay( Double... numbers ) {
		Double result = 1.0;
		for ( Double n : numbers ) {
			result *= n;
		}
		return result;
	}

	//Devide integer
	public Double devide( Integer... numbers ) {
		Double result = numbers[0].doubleValue();
		for ( int i = 1; i < numbers.length; i++ ) {
			if ( numbers[i] == 0 ) {
				throw new IllegalArgumentException( "Number list contains 0. Can't devide by 0" );
			}
			result /= numbers[i];
		}

		return formatDouble( result );
	}

	//Devide Long
	public Double devide( Long... numbers ) {
		Double result = numbers[0].doubleValue();
		for ( int i = 1; i < numbers.length; i++ ) {
			if ( numbers[i] == 0 ) {
				throw new IllegalArgumentException( "Number list contains 0. Can't devide by 0" );
			}
			result /= numbers[i];
		}
		return result;
	}

	//Devide integer
	public Double devide( Double... numbers ) {
		Double result = numbers[0].doubleValue();
		for ( int i = 1; i < numbers.length; i++ ) {
			if ( numbers[i] == 0 ) {
				throw new IllegalArgumentException( "Number list contains 0. Can't devide by 0" );
			}
			result /= numbers[i];
		}
		return result;
	}

	protected Double formatDouble (Double number){
		String pattern = "#.";
		for ( int i = 1; i <= floatinPoint; i++ ) {
			pattern += "0";
		}

		DecimalFormat numberFormat = new DecimalFormat( pattern );
		String formatResult = numberFormat.format( number );
		return Double.parseDouble( formatResult );

	}
}
