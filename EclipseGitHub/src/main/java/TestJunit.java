import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testAppMain {
	
   String message = "Hello, EPSI 3";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
   }
}