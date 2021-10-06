package sampleprograms;

public class EvenUpperCase {

	public static void main(String[] args) {

		String name = "rahul";
		char[] charArray = name.toCharArray();

		System.out.println("Even Letter Uppercase :");
		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 == 0) {
				System.out.println(Character.toUpperCase(charArray[i]));
			}

			else {
				System.out.println(charArray[i]);
			}

		}
		System.out.println("********************");
		System.out.println("Odd Letter Uppercase :");
		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				System.out.println(Character.toUpperCase(charArray[i]));
			}

			else {
				System.out.println(charArray[i]);
			}

		}
	}
}