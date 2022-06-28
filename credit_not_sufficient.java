package AIML;
import java.lang.*;
import java.util.Scanner;

public class credit_not_sufficient extends Exception{

	public credit_not_sufficient(String msg) {
		super(msg);
		
	}
	public static void main(String[] args) throws Throwable {
		int credits;
		Scanner i = new Scanner(System.in);
		System.out.println("enter student credits");
		credits = i.nextInt();
	if(credits<50) {
		throw new credit_not_sufficient("there is no available balance");
	}
	else {
		System.out.println("you are passedto next level");
	}
	}
	
	
}
