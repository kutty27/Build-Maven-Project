package TestCases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunWithJunitCore {

	public static void main(String[] args) {
		int i=0;		
		Result result = JUnitCore.runClasses(TestCases.CalculatorTestWithJunit.class);
//		for(String runs:TestCases.CalculatorTestWithJunit.addMethods) {
//			System.out.println(runs);
//		}
	}
}
