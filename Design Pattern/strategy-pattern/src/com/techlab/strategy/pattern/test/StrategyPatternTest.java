package com.techlab.strategy.pattern.test;

import com.techlab.strategy.pattern.Context;
import com.techlab.strategy.pattern.OperationAdd;
import com.techlab.strategy.pattern.OperationDivision;
import com.techlab.strategy.pattern.OperationMultiply;
import com.techlab.strategy.pattern.OperationSubstract;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("20 + 5 = " + context.ExecuteStrategy(20, 5));

		context = new Context(new OperationSubstract());
		System.out.println("20 - 5 = " + context.ExecuteStrategy(20, 5));

		context = new Context(new OperationMultiply());
		System.out.println("20 X 5 = " + context.ExecuteStrategy(20, 5));

		context = new Context(new OperationDivision());
		System.out.println("20 / 5 = " + context.ExecuteStrategy(20, 5));
	}

}
