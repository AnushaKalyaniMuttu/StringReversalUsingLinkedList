package com.demo;

import java.util.LinkedList;

public class StringReversalUsingLinkedList {
	public static void main (String [] args) {
		String name="anusha";
		String reversed="";
		LinkedList<Character> characters=new LinkedList<>();
	for(Character c: name.toCharArray()) {
		characters.add(c);
	}

	while(!characters.isEmpty()) {
		reversed=characters.pop()+reversed;
	}
	System.out.println(reversed);
	}
	
	

}
