package string;

import java.util.*;

class AssiQNo2
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be converted to UpperCase");
		String str = sc.nextLine();

		str = str.toUpperCase(); 
		System.out.println("String on using toUpperCase() method = " + str);
		
		str = str.toLowerCase(); 
		System.out.println("String on using toLowerCase() method = " + str);
	}
}
