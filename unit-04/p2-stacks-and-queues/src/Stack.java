
import java.util.ArrayList;

public class Stack {


	private ArrayList<Integer> stack;


	/**
	 *
	 * Constructor - initializes the private stack variable,
	 * defined above
	 *
	 **/
	public Stack() {

	}

	/**
	 * push - adds val to the top of the stack
	 **/
	public void push(Integer val) {

	}

	/**
	 * pop - removes and returns the element at the top of the stack,
	 * prints an error message if pop() is called on an empty stack
	 **/
	public Integer pop() {
		return -1;
	}

	/**
	 * size - returns how many elements are in the stack
	 **/
	public int size() {
		return 0;
	}

	/**
	 * toString - returns a string representation of the current stack
	 * you may format this how ever you want
	 **/
	public String toString() {
		return "";
	}

	/**
	 * isInteger - helper function that returns is a string is 
	 * an Integer
	 **/
	public static boolean isInteger(String s) {
		
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}


	/**
	 * main - reads an expression from standard input,
	 * parses the expression into tokens, and performs the
	 * correct postfix operation on each token (see README.md)
	 **/
	public static void main(String[] args) {


		// create a Stack object
		

		// read expression from stdin


		// for every token in expression
		// if token is a operand, push onto stack
		// if token i operator, pop 2 values and 
		// perform operation
		// needs to handle *, /, +, -, and invalid tokens


		// print the answer (last item on the stack)
		// or error if invalid postfix expression
	}
}
