package week1day1assign;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		int fact=1;
		int i;
		//until the input value it iterates and assign the multiplied value to fact
		for(i=1;i<=input;i++) {
			fact=fact*i;
			System.out.println("Factorial Iteration " + i + " value = " + fact);
			}
System.out.println("Final Factorial Output = " + fact);
}
}