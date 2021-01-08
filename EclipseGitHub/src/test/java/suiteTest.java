import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class suiteTest {
	@Test(timeout=1000) // en millisecondes
	public void test() {
		while(true) {}
	}
}
