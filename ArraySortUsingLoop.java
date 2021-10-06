package sampleprograms;

public class ArraySortUsingLoop {

	public static void main(String[] args) {
		int a[] = { 23, 25, 67, 89, 75, 27 };
		int len = a.length;
		System.out.println("Length of an Array is : " + len);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
					// System.out.print(b);
				}

			}

		}
		System.out.println("\nArray sorted in ascending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;

				}
			}
		}
		System.out.println("\nArray sorted in decending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
	}
}
