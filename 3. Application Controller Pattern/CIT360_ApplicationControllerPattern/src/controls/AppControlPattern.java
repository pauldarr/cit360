package controls;

import java.util.HashMap;

public class AppControlPattern {
	// implements HashMap
	public static HashMap<String, HandleMath> hashMapOfCommands = new HashMap<String, HandleMath>();	
		
	public AppControlPattern() {
		
	}
	
	/* Instead of using a series of if statements a HashMap will manage delegating 
	 * the commands to the appropriate classes and returning the value back to the view layer.
	*/ 
	public static void handleCommand(String command, Integer num1, Integer num2) {
		
		hashMapOfCommands.put("+", new Add());
		hashMapOfCommands.put("-", new Subtract());
		hashMapOfCommands.put("*", new Multiply());
		hashMapOfCommands.put("/", new Divide());
		
		HandleMath handler = hashMapOfCommands.get(command);
		
		handler.execute(num1, num2);
		
	}	

}