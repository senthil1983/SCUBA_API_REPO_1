package testng_assignment;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters extends ArithmeticException {
	
private static final long serialVersionUID = 1L;

@ BeforeTest(description="Pass, if the value passed from  Suite")
@ Parameters({"vala","valb"})
	
public void TestNG_Parameter_BeforeTest(int v1, int v2) {
	
	Reporter.log("-------------- Test Suite Parameter Execution Started----------");
	//System.out.println("---------------------- Parameters  -------------------------");
	//System.out.println();
	System.out.println("----- Test Suite Parameter -  execution started-------");
	//System.out.println();
	
	double actual_expo_value = Calculator.exp(v1, v2);

		
    System.out.println("The exponent value from Suite : " + v1 + " of " +v2 + " = "+ actual_expo_value);
    System.out.println();
   // System.out.println("----- Test Suite Parameter -  execution completed-------");
    //System.out.println();
    Reporter.log("-------------- Test Suite Parameter Execution completed----------");
}
	
@ Test (description="Pass, if the value passed from Test Parameters")
@ Parameters({"val1","val2"})
	
public void TestNG_Parameter_Test1(int v1, int v2) {
	
	System.out.println();
	System.out.println("----- Test Parameter 1 - execution started-------");
	//System.out.println();
    
	Reporter.log("-------------- Test Parameter Execution Started----------");
    
	double actual_expo_value = Calculator.exp(v1, v2);

    System.out.println("The exponent values from Test : " + v1 + " of " +v2 + " = " + actual_expo_value);
    
    Reporter.log("-------------- Test Parameter Successfully Executed----------", true);
    
    System.out.println();
   // System.out.println("----- Test Parameter - execution completed-------");
  //  System.out.println();
    
    Reporter.log("-------------- Test Parameter Execution Completed----------");
}


@ Test (description="Pass, if the value passed from Test Parameters")
@ Parameters({"val1","val2"})

public void TestNG_Parameter_Test2(int v1, int v2) {

//System.out.println();
 System.out.println("----- Test Parameter 2 - execution started-------");
//System.out.println();
//
Reporter.log("-------------- Test Parameter 2 Execution Started----------");

double actual_expo_value = Calculator.exp(v1, v2);

System.out.println("The exponent values from Test : " + v1 + " of " +v2 + " = " + actual_expo_value);

Reporter.log("-------------- Test Parameter Successfully Executed----------", true);

//System.out.println();
//System.out.println("----- Test Parameter - execution completed-------");
//System.out.println();

Reporter.log("-------------- Test Parameter Execution Completed----------");
}



}
	

