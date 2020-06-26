package testng_assignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

//import com.maveric.core.testng.BaseTest;

public class TestNG_Groups {


//private static final long serialVersionUID = 1L;

@ Test( priority = 1, groups = {"Add"})

public void add_Group() {
	
	int group_Add = Calculator.add(2, 4);
	
	System.out.println("I am in Add group : "+group_Add);
	
	Reporter.log("-------------- Add group executed successfully----------", true);
}

@ Test( priority = 2, groups = {"Subtract"})

public void sub_Group() {
	
	int group_Sub = Calculator.sub(4, 2);
	
	System.out.println("I am in Subtract group : "+group_Sub);
	
	Reporter.log("-------------- Subtract group executed successfully----------", true);
	
}

@ Test(priority = 3, groups = {"Negate"})

public void negate_Group() {
	
	int group_Negate = Calculator.negate(2);
	System.out.println();
	System.out.println("I am in Negate Group : "+ group_Negate);
	
	Reporter.log("-------------- Negate group executed successfully----------", true);
}

@ Test( priority = 4 , groups = {"Inverse"})

public void inverse_Group() {
	
	double group_inverse = Calculator.inverse(5);
	
	System.out.println("I am in Inverse Group : "+ group_inverse);
	
	Reporter.log("-------------- Inverse group excluded successfully----------", true);
}

}
	

