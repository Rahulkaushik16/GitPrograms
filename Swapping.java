package prog;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11, b = 13;
		System.out.println("Before Swapping : a = " + a + "  & b = " + b);
		System.out.println("\n**************************************");

		a = a + b; // a=24
		b = a - b; // b=11
		a = a - b; // a=13

		System.out.println("\nAfter Swapping : a = " + a + "  & b = " + b);

	}

}
