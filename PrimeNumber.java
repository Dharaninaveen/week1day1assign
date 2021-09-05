package week1day1assign;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=25;
		int bool=0;
		int i;
		//If the remainder is 0, boolean value sets to true and breaks the loop
		for(i=2;i<=input/2;i++) {
			if(input%i==0) {
				bool=1;
				break;
			}
		}
			if(bool==1) {
				System.out.println(input + " is not a Prime Number");
			}
			else {
				System.out.println(input + " is a Prime Number");
			}
	}

}
