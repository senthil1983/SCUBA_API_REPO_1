package testng_assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Parallel1 extends ArithmeticException {
	
private static final long serialVersionUID = 1L;

@ BeforeClass()

public void startMessage() {
	
	//System.out.println(" ---------Parallel 1 call execution started --------------------");
	
}

@ Test( threadPoolSize = 2, invocationCount = 2, timeOut = 1000)
	
	public void TestNG_Add1 () {	
	
		//System.out.println("" );
		int actual_add_value = Calculator.add(24434324, 1932432424);
		long id = Thread.currentThread().getId();
		System.out.println("Inside Parallel Class 1 - Add 1 method         Thread ID = "+ id + "    Add Value = " + actual_add_value);
		//System.out.println("" );
						
        }

@ Test(threadPoolSize = 2, invocationCount = 2, timeOut = 1000)

public void TestNG_Sub1 () {		

	int actual_add_value = Calculator.sub(2, 1);
	long id = Thread.currentThread().getId();
	System.out.println("Inside Parallel Class 1 - Subtract 1 method    Thread ID = "+ id + "    Subtract Value = " + actual_add_value);
	//System.out.println("" );
					
    }

@ Test(threadPoolSize = 2, invocationCount = 2, timeOut = 1000)

public void TestNG_Multi1 () {		

	int actual_add_value = Calculator.mul(4,9);
	long id = Thread.currentThread().getId();
	System.out.println("Inside Parallel Class 1 - Multiply 1 method    Thread ID = "+ id + "    Multiply Value = " + actual_add_value);
	//System.out.println("" );
					
    }

@ AfterClass()

public void endMessage() {
	
	//System.out.println(" ---------Parallel 1 call execution completed --------------------");
	
}
}
	

