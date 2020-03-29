package com.ashish.linkedlist;

public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList integers = new DoublyLinkedList();
		
		integers.insertAtHead(12);
		integers.insertAtHead(21);
		integers.insertAtHead(3);
		integers.insertAtHead(43);
		integers.insertAtHead(76);
		
		System.out.println(integers);
	}

}
