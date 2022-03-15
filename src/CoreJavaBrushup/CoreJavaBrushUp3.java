package CoreJavaBrushup;

public class CoreJavaBrushUp3 {
	
	public static void main(String[] args) {
	
	// String is an object
	
	// String Literal
	
    // String s1 = "Ajay Gupta";
	
	// String New
//	String s2 = new String("Welcome");
//	String s3 = new String("Welcome");
	
	String s = "Ajay Gupta Aarav";
	
	// Split the word
	
	String [] splittedString = s.split("Gupta");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	
	// Remove the initial space from word
	
	System.out.println(splittedString[1].trim());
	
	// Print character by character
	
	for (int i = 0; i<s.length(); i++)
	{
		System.out.println(s.charAt(i));
	}
	
	// Print character by character in REVERSE order
	
	for (int i = s.length()-1; i>=0; i--)
	{
		System.out.println(s.charAt(i));
	}
	
	}
}
