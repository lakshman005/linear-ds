package com.revature.dsa.stackusingarray;

import java.util.EmptyStackException;

public class Stack {
	private int[] items;
	private int top;
	
	public Stack() {
		this.items = new int[Short.MAX_VALUE];
		this.top = -1;
	}
	
	public int size() {
		return top+1;
	}

	public void push(int data) {
		top++;
		items[top]=data;
	}
	
	public int peek() {
		if(top==-1) {
			throw new EmptyStackException();
		}
		return items[top];
	}
	
	public int pop() {
		if(top==-1) {
			throw new EmptyStackException(); 
		}
		top--;

		return items[top+1];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public String toString() {
		if (top == -1) {
			return "Stack is Empty";
		}
		String result = "";
		for (int i = top; i > -1; i--) {
			if (i == top) {
				result += "Top -> " + items[i] + "\n";
			} else {
				result += "       " + items[i] + "\n";
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Stack ans = new Stack();
		ans.push(10);
		ans.push(20);
		ans.push(30);
		ans.push(40);
		System.out.println(ans.peek());
		System.out.println(ans);
		System.out.println(ans.pop());
		System.out.println(ans);
	}
}
