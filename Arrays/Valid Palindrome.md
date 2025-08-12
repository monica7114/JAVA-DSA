## My approach using another String
```java
class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int j= c.length()-1;
        c= c.toLowerCase();
        
        if(c.length()==0 ){
            return true;

        }
        while(i<j){
            if(c.charAt(i)!=c.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}
```
---
## Optimized space approach
```java
public boolean isPalindrome(String s) {
    // Step 1: Initialize two pointers
    int left = 0;
    int right = s.length() - 1;
    
    // Step 2: Check palindrome property with skipping non-alphanumeric
    while (left < right) {
        // Find the next valid alphanumeric character from left
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        
        // Find the next valid alphanumeric character from right
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        
        // Compare characters in a case-insensitive manner
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false; // Not a palindrome if any mismatch occurs
        }
        
        // Move pointers inward
        left++;
        right--;
    }
    
    return true; // String is a palindrome
}
```
---
