package com.revature.dsa.doublylinkedlist;

public class DoublyLinkedList<T> {
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
			node.setPrevious(tail);
			tail = node;
		}
		size++;
	}

	public T get(int index) {
		Node<T> pointer = head;
		if(index>=size || index <0) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=0;i<index;i++) {
			pointer=pointer.getNext();
		}
		return pointer.getData();
	}

	public boolean contains(T data) {
		Node<T> pointer = head;
		for (int i = 0; i < size; i++) {
			if (pointer.getData().equals(data)) {
				return true;
			}
			pointer = pointer.getNext();

		}
		return false;
	}

	public void insert(int index, T data) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> newnode = new Node<T>(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}

		else if(index==0) {
			newnode.setNext(head);
			head.setPrevious(newnode);
			head=newnode;	
		}
		else if(index==size){
			tail.setNext(newnode);
			newnode.setPrevious(tail);
			tail=newnode;
		}
		
		else {
			Node<T>pointer = head;
		    for(int i=0;i<index-1;i++) {
			pointer=pointer.getNext();
		    }
		    Node<T>nextnode=pointer.getNext();
		pointer.setNext(newnode);
		newnode.setNext(nextnode);
		newnode.setPrevious(pointer);
		nextnode.setPrevious(newnode);
		}
		size++;

	}

	public void update(int index, T data) {
		Node<T> pointer=head;
		for(int i=0;i<index-1;i++) {
			pointer=pointer.getNext();
		}
		 pointer.setData(data);

	}
	public void delete(int index) {
		Node<T> pointer = head;
		if(index==size-1) {
			for(int i=0;i<index-1;i++) {
				pointer=pointer.getNext();
			}
			pointer.setNext(null);
		}
		else if(index>=size) {
			throw new IndexOutOfBoundsException();
		}
		else if(index==0) {
			head=pointer.getNext();
			head.setPrevious(null);
		}
		else {
		for(int i=0;i<index-1;i++) {
			pointer=pointer.getNext();
		}
		Node<T>nextnode =pointer.getNext().getNext();
		pointer.setNext(nextnode);
		nextnode.setPrevious(pointer);
		}
	}

	public String toString() {
		Node<T> pointer = head;
		String list = "";
		while (pointer != null) {
			list += pointer;
			pointer = pointer.getNext();
		}
		return list+"\n";
	}

	public static void main(String args[]) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.update(3,90);
		System.out.println(list);
		
	}
}
