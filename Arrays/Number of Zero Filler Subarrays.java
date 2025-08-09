class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // Stores the count of consecutive zeros
        int zerocount = 0;
        // Stores the final answer (total zero-filled subarrays)
        long result = 0;

        // Traverse each number in the array
        for (int num : nums) {
            if (num == 0) {
                // If current number is 0, increase zero streak count
                zerocount++;
            } else {
                /*
                 * Formula: number of subarrays in a streak of length n = n * (n + 1) / 2
                 * Example: [0, 0, 0] → 3 + 2 + 1 = 6 → (3*4)/2
                 * When we hit a non-zero, we calculate the subarrays formed
                 * by the zero streak so far and add to result.
                 */
                result += (zerocount * (zerocount + 1L)) / 2;
                // Reset zero streak count
                zerocount = 0;
            }
        }

        // After loop ends, check if there was a zero streak till the end
        result += (zerocount * (zerocount + 1L)) / 2;

        return result;
    }
}
