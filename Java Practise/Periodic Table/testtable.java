package conductqa.period;
import static org.junit.Assert.assertSame;

import org.junit.Assert.*;
import org.junit.Test;
public class testtable {

	


		
		@Test
		public void tabletest() {
		tablepage run = new tablepage();
		
		
		assertSame(false, run.elements("Mercury", "mb"));
		

	
}
}
