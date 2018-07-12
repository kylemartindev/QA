package conductqa.period;
import static org.junit.Assert.assertSame;

import org.junit.Assert.*;
import org.junit.Test;
public class tabletest2 {

	
	public class maintabletest {

		
		@Test
		public void tabletest() {
		tablepage run = new tablepage();
		
		
		assertSame(true, run.elements("Mercury", "my"));
		
}	
	
}
}
