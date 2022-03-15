package Methods;

public class MethodDemo1 {

	public static void main(String[] args) {
		
		MethodDemo d = new MethodDemo(); // Define the object to access the method of class
		String Name = d.getData(); // Class Method
		System.out.println(Name);	
		
		MethodDemo2 d1 = new MethodDemo2();
//		d1.getUserData();
		String Name1 = d1.getUserData();
		System.out.println(Name1);
		
		MethodDemo2 d2 = new MethodDemo2();
		d2.getUserData();
		String Name2 = d1.getData1();
		System.out.println(Name2);

	}
	
	public static String getData()
	{
		System.out.println("Hello Selenium");
		return "Ajay Gupta";
	}

}
