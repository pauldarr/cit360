package controls;

public class JavaRunnable implements Runnable {
	
	public void run() {

		//prints 10 values for the current thread(s).
		for(int i=0; i<10; i++) {			
			System.out.println("This is process: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}