package Java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int x=Integer.parseInt(n);
		List<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<x;i++)
		{
			arr1.add(Integer.parseInt(reader.readLine()));
		}
		Average_method o=arr->{
		int sum=0;
		for(int i:arr1) {
			sum=sum+i;
		}
		return sum/x;
	    };
	    System.out.println("Average:"+o.operation(arr1));
     }
	
   interface Average_method
   {
	   int operation(List<Integer> arr);
   }
}

