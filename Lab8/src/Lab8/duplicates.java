/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 8
*/
package Lab8;
import java.util.Arrays;
import java.util.Scanner;
public class duplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] list = new int[10];
		 
		System.out.print("Enter ten numbers: ");
		 
			for (int i = 0; i < list.length; i++) {
				list[i] = s.nextInt();
			}
		 
	    System.out.print("The distinct numbers are: " + Arrays.toString(list));
		 
		list = eliminateDuplicates(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
		 
	public static int[] eliminateDuplicates(int[] list) {
		 
		int[] newArray = new int[0];
		boolean flag = true;
		 
		newArray = addToArray(newArray, list[0]);
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < newArray.length; j++) {
		 
					if (list[i] == newArray[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					newArray = addToArray(newArray, list[i]);
				}
		    
				flag = true;
		    }
		  return newArray;
		 }
		 
		 // Copy array 1 to array 2 and return false if original longer than new array
	public static boolean copyArray(int[] original, int[] newArr) {
		if (original.length > newArr.length)
			return false;
		 
			for (int i = 0; i < original.length; i++) {
				newArr[i] = original[i];
			}
			return true;
	}
		 // create new array that is longer than original and return new array
	public static int[] addToArray(int[] original, int data) {
		 
		int[] newArr = new int[original.length + 1];
		copyArray(original, newArr);
		newArr[original.length] = data;
		return newArr;
		 
	}
		 
}