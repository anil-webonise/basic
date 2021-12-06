package easy;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
Ex1
Input: nums = [1,2,3,1]
Output: true
Ex2
Input: nums = [1,2,3,4]
Output: false
Ex3
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

 */
public class DuplicateTest {

    private static boolean containsDuplicate(int[] inputs) {
        int count = 0;
        for (int start = 0; start < inputs.length; start++) {
            if (start != 0 && inputs[0] == inputs[start]) {
                count++;
                break;
            }
        }
        return !(count == 0);
    }


    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));

        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }
}
