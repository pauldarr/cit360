package controls;

public class JavaRunnableProcessTest {
	
	public static void main(String[] args) {
		
		//Calls the JavaRunnable class, creates a new object, and assigned it to the thread variable.
		Thread thread = new Thread(new JavaRunnable());
		thread.start();
		
	}

}