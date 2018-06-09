package controls;

class Threads extends Thread {

	public void run() {
		
		//prints 10 values for the current thread(s).
		for(int i=0; i<10; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + " value " + i);
			
			/*
			This will allow the code to print the multiple threads for each new object 
			from  the JavaThreads method below.
			*/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}		
		
	}	
	
}

public class JavaThreads {
	
	//created  objects of the Threads method and starts them.
	public static void main(String[] args) {
		Threads threads = new Threads();
		threads.start();
		Threads threads2 = new Threads();
		threads2.start();
		Threads threads3 = new Threads();
		threads3.start();
	}

}