package testng_assignment;


//import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Parallel2 extends ArithmeticException {
	
private static final long serialVersionUID = 1L;

@ Test(threadPoolSize = 3, invocationCount = 1, timeOut = 1000)

public void TestNG_Add1 () {	

			//System.out.println("" );
			int actual_add_value = Calculator.add(2, 19);
			long id = Thread.currentThread().getId();
			System.out.println("Inside Parallel Class 2 - Add 1 method         Thread ID = "+ id + "    Add Value = " + actual_add_value);
			//System.out.println("" );
					
    }


@ Test(threadPoolSize = 3, invocationCount = 1, timeOut = 1000)

public void TestNG_Sub1 () {		

		int actual_add_value = Calculator.sub(8, 3);
		long id = Thread.currentThread().getId();
		System.out.println("Inside Parallel Class 2 - Subtract 1 method    Thread ID = "+ id + "    Subtract Value = " + actual_add_value);
		//System.out.println("" );
				
}

@ Test(threadPoolSize = 3, invocationCount = 1, timeOut = 1000)

public void TestNG_Multi1 () {		

int actual_add_value = Calculator.mul(9,9);
long id = Thread.currentThread().getId();
System.out.println("Inside Parallel Class 2 - Multiply 1 method    Thread ID = "+ id + "    Mulitiply Value = " + actual_add_value);
//System.out.println("" );
				
}
}
	

