package com.ashish.linkedlist;

public class LinkedListDemo {
	
	public static void main(String args[]) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtHead(5);
		list.insertAtHead(15);
		list.insertAtHead(2);
		list.insertAtHead(56);
		list.insertAtHead(23);
		
		System.out.println(list);
		System.out.println("length = " + list.length());
		System.out.println("-----------------------------");
		System.out.println("After Deleting Head Node");
		list.deleteFromHead();
		System.out.println(list);
		System.out.println("length = " + list.length());
		System.out.println("-----------------------------");
		System.out.println("Found: " + list.find(15));
		System.out.println("-----------------------------");
		
	}

}
