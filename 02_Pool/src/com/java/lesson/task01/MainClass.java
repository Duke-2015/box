package com.java.lesson.task01;

public class MainClass {

	public static void main(String[] args) {
//		observeCollision(1000);
        MyString myStr1 = MyString.new_MyString("1");
        MyString myStr2 = MyString.new_MyString("1");
        MyString myStr3 = MyString.new_MyString("3");
        System.out.println(myStr1 == myStr2);
        System.out.println(myStr1 == myStr3);
        MyString.printInternPool();
//        MyString.printInternPoolHash();
	}
	
	private static void observeCollision(int number){
		for (int i=0; i < number; i++) {
	        String randString = "";
	        int length = 0 + (int)(1 + Math.random() * 5);
	        for(int j=0; j<length; j++){
//	        	randString += (char)(65 + (Math.random()*(26))); // only big letter
//	        	randString += (char)(97 + (Math.random()*(26))); // only small letter
	        	randString += (char)(32 + (Math.random()*(127-32))); // all ANSY symbols
	        }
//	        System.out.println(randString);
//			String strI = Integer.toString(i);
//			MyString myStr = new MyString(strI);
	        MyString myStr = MyString.new_MyString(randString);
//			}
		}
//		MyString.printInternPoolHash();
		System.out.println("STOP observe collisions");		
	}

}
