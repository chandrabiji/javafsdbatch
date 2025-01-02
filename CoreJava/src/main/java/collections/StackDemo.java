package collections;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		while (true) {
			System.out.println("-----------------------");
			System.out.println("|STACK MENU OPERATIONS|");
			System.out.println("-----------------------");
			System.out.println("| 1.PUSH AN ELEMENT   |");
			System.out.println("| 2.POP AN ELEMENT    |");
			System.out.println("| 3.SEARCH AN ELEMENT |");
			System.out.println("| 4.EXIT              |");
			System.out.println("-------------------------");
			System.out.println("Enter your choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter an element ?");
				int element = sc.nextInt();
				st.push(element);
				System.out.println("Stack Elements are: " + st);
				break;
			case 2:
				st.pop();
				System.out.println("Stack Elements are: " + st);
				break;
			case 3:
				System.out.println("Enter Search Element ?");
				int pos = st.search(sc.nextInt());
				System.out.println("Your Search Element @ " + pos);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-4 only");
			}
		}
	}

}
