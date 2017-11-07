/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 8
*/
package Lab8;
import java.util.Arrays;
import java.util.Scanner;
public class Identical {

	public static void main(String[] args) {
		//declaring scanner
		Scanner s = new Scanner(System.in);
		//input of first list
		boolean run = true;
		
		while (run == true) {
			System.out.println("Please enter list1, with the first number being the length of the list");
			int[] list1 = new int[s.nextInt()];
			for (int i = 0; i < list1.length; i++) {
				list1[i] = s.nextInt();
			}
			//input of second list
			System.out.println("Please enter list2, with the first number being the length of the list");
			int[] list2 = new int[s.nextInt()];
			for (int i = 0; i < list2.length; i++) {
				list2[i] = s.nextInt();
			}
			//printing output
			System.out.println(Arrays.toString(list1));
			System.out.println(Arrays.toString(list2));
			System.out.println("Are the two lists identical: " + identical(list1, list2));
			System.out.println("Do you want to run the program again? y/n");
			String answer = s.next();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				run = false;
			}
			}
		}
	//method checking to see if identical
	public static boolean identical(int[] list1, int[] list2) {
		if (Arrays.equals(list1, list2) == true) {
			return true;
		} else {
			return false;
		}
	
	}

}
