package CoreJavaBrushup;
// import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
	
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,1000};
		
		// Output 2,4,6,8,10,1000
		
		// Check if array has multiple of 2
		
		for (int i = 0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else 
			{
				System.out.println(arr2[i] + "is not multiple of 2");
			}
		} 

/*		ArrayList a = new ArrayList();
		a.add ("Ajay");
		a.add ("Gupta");
		a.add ("Swati");
		a.add ("Aarav");
	//	a.remove(1);
		System.out.println(a.get(3)); */
		
		
	}

}