package com.revature.dsa.singlylinkedlist;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public Node<T> getHead() {
		return head;
	}
	
	public Node<T> getTail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}
	
	public T get(int index) {
		if(index<0 ||index>=size) {
			return null;
		}
		Node<T> pointer = head;
		for(int i=0;i<index;i++) {
			pointer=pointer.getNext();
		}
		return pointer.getData();
	}
	
	public boolean contains(T data) {
		Node<T> pointer = head;
		while(pointer!=null) {
			if(pointer.getData().equals(data)) {
				return true;
			}
			pointer=pointer.getNext();
		}
		return false;
	}
	
	public void insert(int index, T data) {
		Node<T>node =new Node(data);
		Node<T>pointer = head;
		if(index==0) {
			node.setNext(head);
			head=node;
		}
		else if(index<0 ||index>size) {
			throw new IndexOutOfBoundsException();
		}
		else {
		for(int i=0;i<index-1;i++) {
			pointer=pointer.getNext();
		}
		Node<T>nextnode=pointer.getNext();
		pointer.setNext(node);
		node.setNext(nextnode);
		}
		
		
	}
	
	public void update(int index, T data) {
		Node<T> pointer = head;
		if(index>=size|| index<0) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=0;i<index;i++) {
			pointer=pointer.getNext();
			
		}
		pointer.setData(data);
		
		
	}
	
	public void delete(int index) {
		Node<T> pointer=head;
		Node<T> ans =head;
		if(index>=size) {
			throw new IndexOutOfBoundsException();
		}
		else if(index==0) {
			head=pointer.getNext();
		}
		for(int i=0;i<index-1;i++) {
			pointer=pointer.getNext();
			ans=ans.getNext();
		}
		ans=ans.getNext();
		ans=ans.getNext();
		pointer.setNext(ans);
		
		
	}
	
	public String toString() {
		Node<T> pointer = head;
		String result = "";
		for (;pointer != null; pointer = pointer.getNext()) {
			result += pointer.toString();
		}
		return result;
	}
}
