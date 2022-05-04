package com.revature.dsa.singlylinkedlist;

public class LinkDemo {
	
	public static  void main(String[] args) {
		SinglyLinkedList<Integer> game = new SinglyLinkedList<>();
		game.add(10);
		game.add(20);
		game.add(30);
		game.add(40);
		game.add(50);
		System.out.println(game);

	} 

}


/*Node<T>pointer=head;
Node<T>ans=head;
if(index>size) {
	throw new IndexOutOfBoundsException();
}
if(index==0) {
	
}
Node<T> node = new Node<T>(data);
for(int i=0;i<index-1;i++) {
	pointer=pointer.getNext();
	ans=ans.getNext();
}
ans=ans.getNext();
pointer.setNext(node);
node.setNext(ans);*/
