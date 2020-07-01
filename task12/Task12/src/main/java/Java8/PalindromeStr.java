package Java8;

import java.util.ArrayList;
import java.util.function.*;
import java.util.List;

public class PalindromeStr {

	public static void main(String args[])
	{
		List<String> str=new ArrayList<String>();
		str.add("abba");
		str.add("mom");
		str.add("dad");
		str.add("abc");
		Function<List,List> p=P::palin;
		System.out.println(p.apply(str));
	}
}
class P{
	static List<String> palin(List<String> str1)
	{
		int count; 
		List<String> s=new ArrayList<>();
		for(String i:str1){
			count=0;
			for(int j=0;j<i.length()/2;j++) {
				if(i.charAt(j)==i.charAt(i.length()-1-j))count++;
			}
			if(count==i.length()/2)s.add(i);//=s+i+" ";
		}
		return s;
	}
}

