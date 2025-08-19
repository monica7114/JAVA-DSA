## My approach using Frequency array
```java
class Solution {
    public char repeatedCharacter(String s) {
        int[] f= new int[256];
        
        for(int i=0; i<s.length(); i++){
            f[s.charAt(i)]++;
            if(f[s.charAt(i)]==2){
                return s.charAt(i);
            }
        }
        return 'a';
        }
}
```
## Note:
In Java, a char is really just an integer under the hood — each character has a Unicode code point (for ASCII letters, this is the same as the ASCII value).
Example: 'A' → 65, 'a' → 97.
Java automatically converts s.charAt(i) into its integer value, which becomes the index in the freq array.
