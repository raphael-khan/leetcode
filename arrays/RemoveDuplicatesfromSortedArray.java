/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

class Solution {
    public int removeDuplicates(int[] nums) {
        // check that array is not empty. 
        if (nums.length == 0){
            return 0;
        }
        // insertIndex to keep track of where to insert the unique element. 
        int insertIndex = 1;
        // iterate over the array starting at index 1 since index 0 will be unique anyways.
        for (int i = 1; i < nums.length; i++){
            // compare i with the element behind it. if not equal, aka unique 
            if (nums[i] != nums[i-1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            } 
        }
        // end of loop, return insertIndex which woudld have incresed every time unique value was found.
        return insertIndex;
    }
}






