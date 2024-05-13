package package1;
import java.util.Scanner;
public class NumberSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter a sequence of numbers (separated by spaces): ");
		        String sequence = scanner.nextLine();
		        String[] numbers = sequence.split(" ");

		        		        int[] array = new int[numbers.length];
		        for (int i = 0; i < numbers.length; i++) {
		            array[i] = Integer.parseInt(numbers[i]);
		        }

		        
		        System.out.print("Enter a number to be searched: ");
		        int searchNum = scanner.nextInt();

		        
		        int occurrences = countOccurrences(array, searchNum);

		        
		        if (occurrences > 0) {
		            System.out.println("The number " + searchNum + " appears " + occurrences + " time(s) in the array.");
		        } else {
		            System.out.println("The number " + searchNum + " is not present in the array.");
		        }
		    }

		 public static int countOccurrences(int[] arr, int num) {
		        int count = 0;
		        for (int element : arr) {
		            if (element == num) {
		                count++;
		            }
		        }
		        return count;
		    }
		
	}


