package service;

import datastr.MyBST;


public class MainService {
	
	public static void main(String[] args) {
		MyBST<Integer> BSTInt = new  MyBST<>();
		
		
		try {
			BSTInt.add(28);
			BSTInt.add(20);
			BSTInt.add(25);
			BSTInt.add(47);
			BSTInt.add(53);
			BSTInt.print();
			
			System.out.println("25? - " + BSTInt.search(25));
			System.out.println("67? - " + BSTInt.search(67));
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
}}
