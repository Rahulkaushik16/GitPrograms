package sampleprograms;

public class ReverseWords {

	public static void main(String[] args) {
		String s1 = "I am an infinite Developer";
		String[] s2 = s1.split(" ");

		for (int i = 0; i < s2.length; i++) {
			if (i % 2 == 0) {
				char[] ch = s2[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					// for (int j = 1; j <= ch.length - 1; j++) {
					System.out.print(ch[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(s2[i] + " ");
			}
		}
	}

}
