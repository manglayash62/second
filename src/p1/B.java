package p1;

import java.util.StringTokenizer;

public class B {
	public static void main(String[] args) {
		int count=0;
		StringTokenizer str=new StringTokenizer("pankaj sir academy");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println(count++);
		
	}

}
