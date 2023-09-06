package tea;
import java.util.Scanner;// importing input package like iostream

public class HelloWorld {
	

	public static void main(String args[]) {
		/*
		main is called a method
		 TODO Auto-generated method stub
		
	    System.out.println("stay working!");
		double bk;
		bk= 3.233;
	
		System.out.println(bk);
	
		String s;
		s = bucky.nextLine();
		System.out.println(s);
		
		System.out.print(bucky.nextLine());
		
		nextLine() for strings
		nextDouble for double type
		*/
		
		Scanner bucky = new Scanner(System.in);
		double fnum,snum,answer;
		
		System.out.println("Enter First Num : ");
		fnum = bucky.nextDouble();
		
		System.out.println("Enter Second Num: ");
		snum = bucky.nextDouble();
		
		answer = fnum + snum;
		
		System.out.println("Your answer: ");
		System.out.println(answer);
		
		bucky.close();
		

	}

}
