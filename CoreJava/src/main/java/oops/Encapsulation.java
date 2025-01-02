package oops;

//Encapsulation =Data hiding + Data Abstraction
class Account{
	//Data hiding
	private int pin;

	//Data Abstraction
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Account savingAccount = new Account();//instance
		savingAccount.setPin(1234);
		System.out.println("Account Pin Number : "+savingAccount.getPin());

	}

}
