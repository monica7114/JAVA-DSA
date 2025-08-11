## My Approach using HashSet
```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Store only positive numbers
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int j = 1; // Start from the smallest positive integer
        while (true) {
            if (!set.contains(j)) {
                return j; // Found the missing number
            }
            j++;
        }
        
    }
}
```
---
## Optimal Approach by swaping to correct position
```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Starting from 1, check each integer in the array
        for (int i = 1; i <= n + 1; i++) {
            boolean found = false;
            // Check if i is present in the array
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            // If not found, then it's the missing positive
            if (!found) return i;
        }
        return -1; // The function should never reach here
    }
}
```
