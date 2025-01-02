package multithreading;

public class ThreadDemo extends Thread{
	
	public void run() {
		for(int i=6;i<=10;++i) {
			System.out.println("another Thread : "+i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
	}

	public void start() {
		super.start();
		System.out.println("--start method called--");
	}
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		ThreadDemo t4 = new ThreadDemo();
		t1.setPriority(NORM_PRIORITY);//5
		t1.start();
		t2.setPriority(MAX_PRIORITY);//10
		t2.start();
		t3.setPriority(MIN_PRIORITY);//1
		t3.start();
		t4.start();
		//t1.run();
		for(int i=1;i<=5;++i) {
			System.out.println("Main Thread : "+i+" "+Thread.currentThread().getName());
		}

	}

}
