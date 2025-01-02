package regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//This is basic model
		String regex = "123";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("abc");
		if(matcher.matches()) {
		System.out.println("given input is string only");
		}else {
			System.out.println("given input is not a string");
		}
		System.out.println("Enter any String input data ?");
		String input = sc.next();
		while(!Pattern.matches("[a-z]{3}", input)) {
			System.err.println("Please enter your input must be string 3 character only");
			input = sc.next();
		}
		System.out.println("Your Input data = "+input);

	}

}
