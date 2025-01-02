package multithreading;
class Demo2{
	
}
public class Demo extends Demo2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;++i) {
			System.out.println("Inside run method : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t1.start();
		for(int i=6;i<=10;++i) {
			System.out.println("Inside main method : "+i);
		}

	}

	

}
