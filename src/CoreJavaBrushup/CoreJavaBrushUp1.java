package CoreJavaBrushup;
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String website = "Rahul Shetty Academy";
//		char letter = 'r';
//		double dec = 5.99;
//		boolean mycard = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
	
		// + means Concatenation
		
		System.out.println(website);
		
		// Arrays
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,1000};
	//	System.out.println(arr2[4]);
		
		// For loop, arr.length = 5 
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
			
		for (int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);	
		}
		
		String[] Name = {"Ajay", "Swati", "Aarav"};
		
		for (int i = 0; i<Name.length; i++)
		{
			System.out.println(Name[i]);
		}
		
		double[] dec1 = {1.1, 1.2, 1.3};
		
		for (int i = 0; i<dec1.length; i++)
		{
			System.out.println(dec1[i]);
		}
		
		// Enhanced syntex for For loop
		
		for (String s: Name)
		{
			System.out.println(s);
		}
	
		// Enhanced syntex for For loop of Double
		
		for (double d: dec1)
		{
			System.out.println(d);
		}
		
		
		
		
		
	}	
	}
