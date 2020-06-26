package testng_assignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;

public class TestNG_Assertion extends BaseTest {
	
//private static final long serialVersionUID = 1L;

@ Test(description="AssertEquals")
	
	public void TestNG_Assertion_AssertEquals () {		
	
		int expected_add_value = 4;
		int actual_add_value = Calculator.add(1, 3);
		System.out.println("");
			
		// Assertequals method matches two value 
		Assert.assertEquals(actual_add_value, expected_add_value, "The assertEquals value is not matched : ");
		Reporter.log("-------------- assertTrue vaidation passed----------", true);
			
        } 

@ Test(description="assertTrue")

public void TestNG_Assertion_assertTrue () {		

	int actual_modlus_value = Calculator.mod(1, 2);
		
	// AssertTrues method validate if the condtion is true 
	Assert.assertTrue(actual_modlus_value >1, "The assertTrue condition :  ");
	Reporter.log("-------------- assertTrue condition failed----------", true);
			
  } 

@ Test(description="assertNotEquals")

public void TestNG_Assertion_assertNotEquals () {		

	int expected_sub_value =1;
	int actual_sub_value = Calculator.sub(2, 1);	
	
	Assert.assertNotEquals(actual_sub_value,expected_sub_value,"The assertNotEquals value is matched  :  ");
	Reporter.log("-------------- assertNotEquals validation failed----------", true);
	
    }



@ Test(description="assertFalse")

public void TestNG_Assertion_assertFalse () {		

	int actual_modlus_value = Calculator.mod(1, 2);	
	

		// Check boolean value returned by condition and will pass if returned value is "False" 
		Assert.assertFalse(actual_modlus_value >0, "The assertFalse condition :  ");
		Reporter.log("-------------- assertFalse condition failed----------", true);
	}
	


}
	

