package views;

import java.util.Scanner;

import controls.AppControlPattern;

public class Application {
	
	public static void main(String[] args) {
		AppControlPattern deligate = new AppControlPattern();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		Integer num1 = Integer.parseInt(in.nextLine());
		System.out.println("Enter a command(+, -, /, *)");
		String command = in.nextLine();
		System.out.println("Enter another number: ");
		Integer num2 = Integer.parseInt(in.nextLine());
		
		System.out.print(num1 + " " + command + " " + num2 + " = " );
		deligate.handleCommand(command, num1, num2);
		
	}

}
