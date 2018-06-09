package controls;

public class Divide implements HandleMath {
	// takes in the values entered in the application class and return the value
	public void execute(Integer num1, Integer num2) {
		Integer value = num1 / num2;
		System.out.println(value);
	}

}
