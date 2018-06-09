package controls;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutors {
	
	public static void main (String[] args) throws InterruptedException {
		
		//Uses the ExecutorService to limit how many threads can run concurrently
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//Counter is set to 10
		for(int i=0; i<=10; i++) {
			
			//call executorService variable and executes a new runnable command.
			executorService.execute(new Runnable() {

				public void run() {
					//Mimics a series of tasks that need to processed.  Uses Try/Catch for error handling.
					try {
						System.out.println("Task 1");
						Thread.currentThread();
						Thread.sleep(1500);
						System.out.println("Task 2");
						Thread.currentThread();
						Thread.sleep(1500);
						System.out.println("Task 3");
						Thread.currentThread();
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
					
				}				
				
			});
			
		}
		
	}

}