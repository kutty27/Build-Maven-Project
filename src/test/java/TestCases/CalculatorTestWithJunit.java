package TestCases;

import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Main.Calculator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTestWithJunit {
	
	public static ArrayList<String> addMethods=new ArrayList<String>(); 

	@Test
	public void A_testAdd() {
		addMethods.add("A_testAdd");
		Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        if(result==8) {
        	System.out.println("Add method was executed successfully");
        }else {
        	System.out.println("Execution of Add method is failed");
        }
	}
	
	@Test
	public void B_testSub() {
		addMethods.add("B_testSub");
		Calculator calculator = new Calculator();
        int result = calculator.sub(10, 5);
        if(result==5) {
        	System.out.println("Subtract method was executed successfully");
        }else {
        	System.out.println("Execution of Subtract method is failed");
        }
	}
	
	@Test
	public void C_testMultiplication() {
		addMethods.add("C_testMultiplication");
		Calculator calculator = new Calculator();
        int result = calculator.mul(3, 5);
        if(result==15) {
        	System.out.println("Multiplication method was executed successfully");
        }else {
        	System.out.println("Execution of Multiplication method is failed");
        }
	}
	
	@Test
	public void D_testDiv() {
		addMethods.add("D_testDiv");
		Calculator calculator = new Calculator();
        int result = calculator.add(20, 5);
        if(result==4) {
        	System.out.println("Divison method was executed successfully");
        }else {
        	System.out.println("Execution of Divison method is failed");
        }
	}

}
