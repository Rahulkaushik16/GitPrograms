package sampleprograms;

public class StringMemory {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		String obj1 = new String("Hello");
		String obj2 = new String("Hello");

		System.err.println(s1 + " -------> " + System.identityHashCode(s1));
		System.out.println(s2 + " -------> " + System.identityHashCode(s2));

		System.out.println("***************************************");

		System.err.println(obj1 + " -------> " + System.identityHashCode(obj1));
		System.out.println(obj2 + " -------> " + System.identityHashCode(obj2));
	}

}
