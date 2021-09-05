package week1day1assign;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNumber=0;
		int SecNumber=1;
		int sum;
		int range=6;
		int i;
		System.out.println(firstNumber);
		System.out.println(SecNumber);
		for (i=1;i<=range;i++) {
			sum=firstNumber+SecNumber;
			System.out.println(sum);
			firstNumber=SecNumber;
			SecNumber=sum;		
		}

	}

}
