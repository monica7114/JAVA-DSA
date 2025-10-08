## Using For Loop
```java
class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0; i<=n; i++){
            int count=0;
            int num=i;
            while(num>0){
                count+= num%2;
                num/=2;
            }
            res[i]=count;
        }
        return res;
    }
}
```
## Using DP
```java
public int[] countBits(int n) {
    int[] res = new int[n + 1];
    res[0] = 0;
    
    for (int i = 1; i <= n; i++) {
        // Use results from smaller numbers and add 1 if the current number is odd
        res[i] = res[i >> 1] + (i & 1);
    }
    return res;
}
```
