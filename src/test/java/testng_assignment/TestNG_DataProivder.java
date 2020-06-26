package testng_assignment;


import org.testng.Reporter;
//import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;

public class TestNG_DataProivder extends BaseTest {
	
//private static final long serialVersionUID = 1L;

/**
     * @return Object[][] where first column contains 'value1'
     * and second column contains 'value2' for multiplication
     */
	
	@ DataProvider (name = "Multiplication")
	public Object [][] get_DataProvider () {
		
		return new Object[][] 
				{
				{1,1},
				{2,2},
				{3,3},
				{4,4},
				{5,5},
				{6,6},
				{7,7},
				{8,8},
				{9,9},
				{10,10}
				};
			
	}
	
	@ BeforeClass()
	
	public void startMessage() {
		
		System.out.println();
		System.out.println("-------------- Data Provider Execution Started----------");
		System.out.println();
	}
	
	@ Test (dataProvider = "Multiplication")
	
	public void TestNG_DataProvider(int val1 , int val2) {
				

		int actual_multiplication_value = Calculator.mul(val1, val2);
		System.out.println(" The mulitiplicaiton of " + val1 + " X " + val2 +" is = " + actual_multiplication_value);
		Reporter.log("-------------- DataProvided was executed successfully--------", true);
		
		
	}
	
@ AfterClass()
	
	public void endMessage() {
		
		System.out.println();
		System.out.println("-------------- Data Provider Execution Completed----------");
		System.out.println();
	}

}
	

