package arrays;

public class RotateArray {
	
	
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
	
	public void rotate(int[] nums, int k) {
        // brute force method where we shift each element one by one. 

        // find the number of effective rotations needed. 
        k %= nums.length;

        // initialize variables. 
        int temp, previous;

        // outer loop that runs k times. 
        for (int i = 0; i < k; i++) {
            // stores the last element in the array to be shifted right. 
            previous = nums[nums.length - 1];
            // stores each element from start.
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }

    }

}
