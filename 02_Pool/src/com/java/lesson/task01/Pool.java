package com.java.lesson.task01;

final public class Pool {
	private static DinamicArrayOfBucket pool;

	static{
		pool = new DinamicArrayOfBucket();
	}
	
	static public int count(){
		return pool.count();
	}

	static public String getPool(){
		return String.valueOf(pool);
	}

//	get only hash
	static public String getPoolHash() {
		String answer = "";
		for (int i=0; i < pool.count(); i++) {
			answer += String.valueOf(pool.getElement(i).getHash() ) + ", ";
		}
		return answer;
	}

	public static MyString addInPool(String str){
		int hash = str.hashCode();
		int numberBucket = findNumberHashInPool(hash); // number of needed Bucket in pool			
		if (numberBucket == -1) {
			Bucket newBucket = new Bucket(str);
			pool.add(newBucket);
			return newBucket.getMyString(0);
		} else {
			Bucket oldBucket = pool.getElement(numberBucket); // it is needed Bucket
//			System.out.println(oldBucket);
			int numberString =  oldBucket.findNumberStringInBucket(str); // number string in bucket in pool
			if (numberString == -1) {
				MyString answer = oldBucket.addString(str);				
				System.out.println("Collision with hash " +  hash);
				System.out.println(oldBucket);
				return answer;
			} else {
				return oldBucket.getMyString(numberString);
			}
		}
	}
	
//	private static boolean isNewHash(int hash) {
//		return findNumberHashInPool(hash) == -1 ;
//	}
	
//	private static boolean isNewStringInBucket(String str, int numberBucket) {
//		Bucket tempBucket = pool.getElement(numberBucket); // bucket with needed hash
//		return  tempBucket.numberStrInBucket(str) == -1;
//	}
	
//	private static void addPool(String str){
//		int hash = str.hashCode();
//		int numberHashInPool = findNumberHashInPool(hash); 
//		if (numberHashInPool != -1){
//			Bucket tempBucket = pool.getElement(numberHashInPool);
//			int numberStrInBucket = tempBucket.numberStrInBucket(str);
//			if (numberStrInBucket == -1){
//				pool.getElement(numberHashInPool).addString(str);
//			} else {
//				System.out.println("Collision with hash " +  hash);
//				System.out.println(str + " vs. " +tempBucket.getString(numberStrInBucket));
//			}			
//		} else {
//			pool.add(new Bucket(str));
//		}
//	}
	
	private static int findNumberHashInPool(int hash){
		for(int i = 0; i < pool.count(); i++){
			if (pool.getElement(i).getHash() == hash)
				return i;
		}
		return -1;
	}
	
	
}
