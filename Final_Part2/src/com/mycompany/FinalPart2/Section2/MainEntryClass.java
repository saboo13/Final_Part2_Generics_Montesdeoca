package com.mycompany.FinalPart2.Section2;

public class MainEntryClass {
	public static void main(String[] args) {
		
		
		
		
		
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<Integer, String>(1, "Sebastian");
		 	MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		 	Float i1 = MyRegularClass.getSum(10, 20);
		 	Float f1 = MyRegularClass.getSum(100f, 200f);	
		 	System.out.println("Key: " + mgi1.getKey1() + "  Value: " + mgi1.getValue());
	System.out.println("Key: " + mgi2.getKey1() + "  Value: " + mgi2.getValue());
			
	System.out.println("Integer: " + i1);
	System.out.println("Float: " + f1);
		 		
		 	}
	}

