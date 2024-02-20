package exercise2;

import java.util.Arrays;
import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt(UPPER_BOUND);
		nums[0] = randnum;
		System.out.println(nums[0]);
		for (int i = 1; i < SIZE; i++) {
			randnum = rand.nextInt(UPPER_BOUND);
			nums[i] = nums[i - 1] + randnum;
			System.out.println(nums[i]);
		}
		System.out.println(Arrays.toString(nums));

		int target = Integer.parseInt(System.console().readLine("Enter a target number: "));
		int result = binarySearch(nums, target);
		
		if( result == -1 )
		{
			System.out.println("The target number does not exist in the list.");
		}
		else
		{
			System.out.println("The target number was found at index " + result);
		}
	}
	
	public static int binarySearch( Integer[] nums, int target )
	{
		int low = 0;
		int high = nums.length - 1;
		System.out.println("high: " + high);
		int mid = high / 2;
		while (low <= high) {
			if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] == target) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		return -1;
	}

}
