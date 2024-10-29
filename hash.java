import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return the two indices
            }
            
            // Store the current number with its index
            map.put(nums[i], i);
        }

        // If no solution is found (though the problem guarantees one)
        throw new IllegalArgumentException("No two sum solution");
    }
}
