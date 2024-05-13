package package6;

public class ArrayDeletion {
	    public static int[] deleteElement(int[] array, int index) {
	        
	        if (index < 0 || index >= array.length) {
	            System.out.println("Invalid index.");
	            return array; 
	        }
	       
	        int[] newArray = new int[array.length - 1];

	      
	        int newIndex = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (i != index) {
	                newArray[newIndex] = array[i];
	                newIndex++;
	            }
	        }

	        return newArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 7, 1, 9, 4};
	        int index = 2;

	        System.out.println("Array before deletion:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        int[] modifiedArray = deleteElement(array, index);

	        System.out.println("\nArray after deletion:");
	        for (int num : modifiedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}
