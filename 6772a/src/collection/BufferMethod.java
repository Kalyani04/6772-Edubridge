package collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferMethod 
{
	public static void main(String[] args)
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter any value");
			String num = br.readLine();
			
			int n = Integer.parseInt(num);
			float f = Float.parseFloat(num);
			double d = Double.parseDouble(num);
			
		System.out.println("Integer: "+n);
		System.out.println("Float: "+f);
		System.out.println("double: " +d);
		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
