package com.Graymatter;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class DemoOnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";//same hashcode --99162322
		System.out.println(str.hashCode());//hashcode is like reference it depends on content
		str="hh";
		System.out.println(str.hashCode());//--hashcode==3328
		
		String s1 =new String("hello"); //same hashcode--99162322
		System.out.println(s1.hashCode());
		
		
		//string methods
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String s =str;
		System.out.println(s.hashCode());//same hashcode-3328
		str = str+"world";
		System.out.println(str);
		System.out.println(str.equals(s));//to check if two strings are equal or not
		String s2 ="   hello  ";
		System.out.println(s2.trim().length());
		s2 = s2.replace('h','c');
		System.out.println(s2);
		s1="apple";
		s2="ball";
		System.out.println(s1.compareTo(s2));  //-1 means s1 comes before s2 
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.charAt(2));
		s1.isBlank();
		s1.isEmpty();
		
		
		StringBuffer sbf = new StringBuffer(50);  //capacity =50
		System.out.println(sbf.hashCode()); 
		sbf.append("amrit");
		System.out.println(sbf.hashCode());//here no new hashcode same as above it just replaces the data at same space
		
		System.out.println(sbf.capacity());
		s = sbf.toString();
		sbf.append("hhh");
		System.out.println(sbf);
		
		String strarr[]= {"amrit","ssshhhh","fffsss"};
		for(var sy:strarr) {
			if(sy.charAt(0)=='s') {//or use startsWith("s")
				System.out.println(sy);
			}
		}
		String para = "s hhh hhh jjj";
		String strr[]=para.split(" ");
		System.out.println(Arrays.toString(strr));
		
		String joiner="";
		for(String sr:strr) {
			joiner=joiner + sr + " ";
			
		}
		System.out.println(joiner);
		
		StringTokenizer tokenizer = new StringTokenizer(para," ");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		StringJoiner sjoiner = new StringJoiner(",");  //delimitter ==","
		sjoiner.add("apple");
		sjoiner.add("ball");
		sjoiner.add("apple");
		sjoiner.add("ball");
		sjoiner.add("apple");
		sjoiner.add("ball");
		System.out.println(sjoiner);
		
		
		
		

	}

}
