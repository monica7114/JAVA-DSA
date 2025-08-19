## Using Hashset
```java
import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s=new HashSet<>();
        
        for(char ch: sentence.toLowerCase().toCharArray()){
            if(ch>='a' && ch<='z'){
                s.add(ch);
            }
        }
    
        
        return s.size()==26;
    }
}
```
## Most Optimal Solution 
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)==-1)
            {
                return false;
            }

        }
        return true;
        
    }
}
