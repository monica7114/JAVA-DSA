## My aproach using Frequency array
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] f1= new int[256];
        int[] f2= new int[256];
        for(int i=0; i<s.length(); i++){
            f1[s.charAt(i)]++;
        }
        for(int i=0; i<t.length(); i++){
            f2[t.charAt(i)]++;
        }
        boolean isEqual = Arrays.equals(f1, f2);
        return isEqual;
    }
}
```
