import java.util.HashMap;
public class Morsecode {
	
	public static void main(String [] args) {
		


		HashMap<String, String> morse = new HashMap<>();
		
		
		
		 morse.put(".-", "A");
	    morse.put("-...", "B");
	    morse.put("-.-.", "C");
	    morse.put("-..", "D");
	    morse.put(".", "E");
	    morse.put("..-.", "F");
	    morse.put("--.", "G");
	    morse.put("....", "H");
	    morse.put("..", "I");
	    morse.put(".---", "J");
	    morse.put("-.-", "K");
	    morse.put(".-..", "L");
	    morse.put("--", "M");
	    morse.put("-.", "N");
	    morse.put("---", "O");
	    morse.put(".--.", "P");
	    morse.put("--.-", "Q");
	    morse.put(".-.", "R");
	    morse.put("...", "S");
	    morse.put("-", "T");
	    morse.put("..-", "U");
	    morse.put("...-", "V");
	    morse.put(".--", "W");
	    morse.put("-..-", "X");
	    morse.put("-.--", "Y");
	    morse.put("--..", "Z");

		
		
		
		
		
		String str = new String (".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. ");
		
		
		System.out.println("Returns: ");
		
		for (String retval: str.split(" / ")) {
			
			for (String again: retval.split(" ")) {
		
		 {
				
				System.out.print(morse.get(again));
				
			}
			//
		
		
		
		
	
		
		
		}
		
	} 
	
	
	
	
	

}}
