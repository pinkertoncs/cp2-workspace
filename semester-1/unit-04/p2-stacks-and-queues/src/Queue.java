
import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

	/**
	 * public internal class Order to hold the 
	 * name of the customer and the time their order is
	 * complete
	 **/
	public static class Order {
		public String name;
		public int time;
	}

	/**
	 * internal variable to model order queue
	 **/
	private ArrayList<Order> queue;


	/**
	 * constructor - initializes private variables
	 **/
	public Queue() {

	}

	/**
	 * push - inserts Order o into the correct position in the queue
	 * based on the order time (least to greatest)
	 */
	public void push(Order o) {

	}

	/**
	 * pop - removes the order at the front of the queue
	 **/
	public Order pop() {
		return null;
	}

	/**
	 * size - returns the number of elements in the queue
	 **/
	public int size() {
		return -1;
	}

	/**
	 * toString - returns a string representation of the queue
	 * this may be in any format you choose
	 **/
	public String toString() {
		return "";
	}

	/**
	 *
	 * main - read through all the orders, calculate their completion time,
	 * push them onto the queue, and print the order the customers will be served 
	 **/
	public static void main(String[] args) {

		// create a Queue Object
		
		// Use a scanner to read each order, create the Order object,
		// calculate the time, and push onto the queue


		// print the serving order of the customers
	}
}
