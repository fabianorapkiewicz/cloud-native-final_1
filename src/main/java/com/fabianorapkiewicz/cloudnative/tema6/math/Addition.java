package com.fabianorapkiewicz.cloudnative.tema6.math;

import javax.validation.constraints.NotNull;


public class Addition implements MathOperation{
	
	@Override
	public double compute(@NotNull Double firstValue, @NotNull Double secondValue) {
		return firstValue + secondValue;
	}
}
