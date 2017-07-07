package findOutDuplicate;
/**
 * Find out duplicate number between 1 to n numbers
 * 
 * Description:
 * You have got a range of numbers between 1 to N,
 * where one of the number is repeated.
 * You need to write a program to find out the duplicate number.
 * 
 * GitHub 201707071918
 * 
 */
import java.util.HashSet;

class FindOutDuplicate {
	public static void main(String[] args) {
		// Generate test date
		int[] numerals = new int[20];
		for (int i = 0; i < numerals.length; i++) {
			numerals[i]=i+1;
		}
		numerals[12]=12;	// Duplicate 12
		numerals[16]=16;	// Duplicate 16
		print(numerals);
		
		// Detect the duplicated numbers
		System.out.print("There are duplicated "+getDupNum(numerals)+" numbers.");
	}
	
	// How many numbers are duplicated?
	public static int getDupNum(int[] vektor){
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer num : vektor) {
			set.add(num);
		}
		return vektor.length-set.size();
	}
	
	// Print the test data!
	public static void print(int[] vektor){
		for (Integer num : vektor) {
			System.out.print(num+", ");
		}
		System.out.println();
	}
}
