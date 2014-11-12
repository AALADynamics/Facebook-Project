My name is Adeel
import java.util.Scanner;

public class Q {

public static void main(String[] args) {

	Scanner TakeInput = new Scanner(System.in);

	System.out.print("Enter the size of array: ");
	int size = TakeInput.nextInt();

	int[] arra = new int[size];

	for(int i=0 ; i<size ; i++) {

		arra[i] = TakeInput.nextInt();
	}

	maximum2(arra, size);
	int temp = minimum2(arra, size);
	System.out.println("Second minimum element = " + temp);
}

public static void maximum2(int[] arra, int size) {

	int max1 = arra[0];
	int max2 = arra[0];

	for(int i=0 ; i<size ; i++) {

		if(arra[i] > max1) {

			max2 = max1;
			max1 = arra[i];
		}

		else if(arra[i] > max2) {

			max2 = arra[i];
		}
	}
	int temp = max2;
	print_max(temp);
}

public static int minimum2(int[] arra, int size) {

	int min1 = arra[0];
	int min2 = arra[0];

	for(int i=0 ; i<size ; i++) {

		if(arra[i] < min1) {

			min2 = min1;
			min1 = arra[i];
		}

		else if(arra[i] < min2) {

			min2 = arra[i];
		}
	}
	return min2;
}

public static void print_max(int temp)
{
	System.out.println("Second maximum element = " + temp);
}

}	// end class
