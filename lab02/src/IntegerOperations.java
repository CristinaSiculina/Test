package Test.lab02;

import static java.lang.System.*;

public class IntegerOperations {
	private static void validateArguments(String[] args){
		if(args.length < 3){
			err.println("Usage: IntegerOperations int1 int2 operator");
			exit(-1);
		}
	}
			
	private static int readInt(String input){
		if (stringIsEmpty(input)){
			err.println("Invalid numer: " + input);
			return Integer.MIN_VALUE; //without exceptions;
		}
		try{
			return Integer.parseInt(input);	
		} catch (NumberFormatException e) {
			return Integer.MIN_VALUE;
		}
	}
	
	private static boolean stringIsEmpty(String input){
		return input == null || input.trim().length() == 0;
	}
	
	private static int divide(int a, int b){
		if (b == 0){
			err.println("Division by zero!");
			return Integer.MIN_VALUE;
		}
		return a / b;
	}
	private static int modulo(int a, int b){
		if (b == 0){
			err.println("Division by zero!");
			return Integer.MIN_VALUE;
		}
		return a % b;
	}
	
	public static void main(String[] args){
		validateArguments(args);
		int a = readInt(args[0]);
		int b = readInt(args[1]);
		String operation = args[2].toLowerCase();
		int result = Integer.MIN_VALUE;
		
		if (operation.equals("+"))
			result = a + b;
		else if (operation.equals("*"))
			result = a * b;
		else if (operation.equals("/"))
			result = divide(a, b);
		else if (operation.equals("%"))
			result = modulo(a, b);
		else
			err.println("Unknown operation");
		out.printf("%d %s %d = %d\n",a , operation, b, result);
	}
}
