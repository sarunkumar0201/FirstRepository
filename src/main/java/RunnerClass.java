import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Login.class,SearchHotel.class,SelectHotel.class,BookNow.class,OrderNo.class})


public class RunnerClass 
{
	@Test
	public void test() {
		Result r= 	JUnitCore.runClasses(Login.class,SearchHotel.class,SelectHotel.class,BookNow.class,OrderNo.class);
		
		System.out.println("Run Count "+r.getRunCount());	
		System.out.println("Failure Count "+r.getFailureCount());
		System.out.println("Ignore Count "+r.getIgnoreCount());
		System.out.println("Run Time "+r.getRunTime());
	}
	
	
}
