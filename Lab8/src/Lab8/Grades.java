/* CS 1301/9
 * Fall 2017   
 * Name: Aidan Murphy	
 * Instructor: Monisha Verma
 * Assignment: Lab 8
*/
package Lab8;
import java.util.Arrays;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		//declaration of scanner
		Scanner s = new Scanner(System.in);
		//taking number of students
		System.out.println("Enter the number of students");
		int numStudents = s.nextInt();
		//declaring arrays
		int[] studentsScores = new int[numStudents];
		String[] studentsGrades = new String[numStudents];
		//taking scores
		System.out.println("Enter " + numStudents + " scores");
		for (int i = 0; i < numStudents; i++) {
		int score = s.nextInt();
		studentsScores[i] = score;
		}
		
		//sorting array and setting best score
		Arrays.sort(studentsScores);
		int best = studentsScores[studentsScores.length-1];
		//setting students grades
		for (int i = 0; i < numStudents; i++) {
			if (studentsScores[i] < best-40) {
				studentsGrades[i] = "F";
			} else if (studentsScores[i] < best-30) {
				studentsGrades[i] = "D";
			} else if (studentsScores[i] < best-20) {
				studentsGrades[i] = "C";
			} else if (studentsScores[i] < best-10) {
				studentsGrades[i] = "B";
			} else if (studentsScores[i] <= best) {
				studentsGrades[i] = "A";
			}
		}
		//printing students scores and grades
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Student " + i + " score is " + studentsScores[i] + " and grade is " + studentsGrades[i]);
		}
	}
}
