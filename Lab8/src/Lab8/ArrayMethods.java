/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 8
*/
package Lab8;
import java.util.Arrays;
public class ArrayMethods {

	public static void main(String[] args) {
		
		int[] random = new int[5];

		for(int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random()*1000);
		}
		//prints
		System.out.println("The initial array is " + Arrays.toString(random));
		arrayReverse(random);
		System.out.println("The reversed array is " + Arrays.toString(random));
		System.out.println("The maximum number in the array is " + arrayMax(random));
		System.out.println("The minimum number in the array is " + arrayMin(random));
		arraySquared(random);
		System.out.println("The array squared is " + Arrays.toString(random));
	}
	//method for max
	public static int arrayMax(int[] arr) {
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		return max;
	}
	//method for min
	public static int arrayMin(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		return min;
	}
	//method for squared
	public static void arraySquared(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(arr[i], 2);
		}
	}
	//method for reverse
	public static void arrayReverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
		    int tmp = arr[i];
		    arr[i] = arr[arr.length - 1 - i];
		    arr[arr.length - 1 - i] = tmp;
		}
	}
}
