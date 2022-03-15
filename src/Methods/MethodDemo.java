package Methods;

public class MethodDemo {

	public static void main(String[] args) {
	
		MethodDemo d = new MethodDemo(); // Define the object to access the method of class
		String Name = d.getData(); // Class Method
		System.out.println(Name);

	}
	
	// Not inside the block, it is for execution purpose
	// Why Method - Recall many times again and again, can create any method
	
	public String getData()
	{
		System.out.println("Hello Selenium");
		
		// Return the value
		
		return "Ajay Gupta";
	} 

}
