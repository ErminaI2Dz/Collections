package com.testCollections;

import com.collections.ArrayLists;

public class Test {

	public static void main(String[] args) {
		ArrayLists list = new ArrayLists();

		for (int i = 0; i < 30; i++) {
			list.add(new Object());
		}

		System.out.println("Does list empty? " + list.isEmpty());
		System.out.println("Which is a list size? " + list.size());
		String s = "11";
		list.add(s);
		System.out.println("Which is a list size? " + list.size());
		System.out.println("Does list contain string s? " + list.contains(s));
		list.remove(s);
		System.out.println("Which is a list size? " + list.size());
		list.clear();
		System.out.println("Which is a list size? " + list.size());
	}
}