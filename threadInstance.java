
public class threadInstance {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread("one"));
		Thread t2 = new Thread(new MyThread("two"));
		Thread t3 = new Thread(new MyThread("three"));
		Thread t4 = new Thread(new MyThread("four"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}catch(Exception e) {
			
		}
		
	}
	
}
