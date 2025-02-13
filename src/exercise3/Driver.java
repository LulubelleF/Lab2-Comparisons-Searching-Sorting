package exercise3;

import java.util.Arrays;
import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{

        char sortChoice = args[0].charAt(0); 
        Integer[] nums = generateArray(); 

        System.out.println("Before Sorting:");
        printArray(nums);

        switch (sortChoice) {
            case 'b': 
            	break;
            case 'i': 
            	insertionSort(nums); break;
            case 's': 
            	break;
            case 'q': 
            	break;
            default: 
                return;
        }

        System.out.println("After Sorting:");
        printArray(nums);
	}
	
	private static void printArray(Integer[] nums)
	{
		System.out.println(Arrays.toString(nums));
	}
	public static Integer[] generateArray() {

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
		}
		return nums;
	}
	
	// insertion sort
	public static void insertionSort(Integer[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] < key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

}
