## Using XOR
``` java
public int singleNumber(int[] nums) {
    int result = 0; // Initialize result which will hold our single number
    
    // XOR all elements; duplicates will cancel out
    for (int num : nums) {
        result ^= num; // XORing each number with the result
    }
    
    return result; // The resulting XOR is the single number
}
```
## XOR means:

## Compare each bit.

# If the bits are the same, result is 0.

# If the bits are different, result is 1.

Examples:

5 ^ 5 = 0   (same numbers cancel)
5 ^ 0 = 5   (XOR with 0 gives the same number)


So:

a ^ a = 0

a ^ 0 = a

That’s all you need.
