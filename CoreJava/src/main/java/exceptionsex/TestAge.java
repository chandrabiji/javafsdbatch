package exceptionsex;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	public TooYoungException(String msg) {
		super(msg);
	}
}
class TooOldException extends RuntimeException{
	public TooOldException(String msg) {
		super(msg);
	}
}
public class TestAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age ?");
		int age = sc.nextInt();
		if(age<18) {
			throw new TooYoungException("You have to wait some more time");
		}else if(age>60) {
			throw new TooOldException("You have to take care because of covid");
		}else {
			System.out.println("Welcome to Voting System.....");
		}

	}

}
