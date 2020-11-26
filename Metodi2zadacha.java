package paki4;

public class Metodi2zadacha {
	public static void main(String[] args) {
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;
		
		while (count < 120) {
		//	boolean isPalindrome = isPalindrome(number);
			//boolean isPrime = isPrime(number);
			if (!isPalindrome(number) || ! isPrime(number)) {
				number++;
				continue;
			}
			 System.out.print(number + "\t");
			    count++;
			    number++;
			    if(count % 10 == 0) {
			    	System.out.println();
		
		}
		
	    
	    }
		}
//}
	
	public static boolean isPrime(int aNumber) {
		int maxDivider = (int) Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for (int i=2; i <= maxDivider; i++) {
			if(aNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
	
		return isPrime;
	}
	public static boolean isPalindrome(int aNumber) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		//boolean isPalindrome = true;
		while ( copyNumber != 0) {
			int remainder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyNumber /= 10;
		}
		return aNumber == reversedNumber;
		//return aNumber = reversedNumber;
		//return isPalindrome(aNumber);
		//if (aNumber == reversedNumber) {
			// isPalindrome;
			
		}
	}


