## Using StringBuilder
```java
class Solution {
    public String convert(String s, int numRows) {
        int curr=0;
        boolean down=false;
        if(numRows==1){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i]=new StringBuilder();
        }
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            if(curr==0||curr==numRows-1){
                down= !down;
            }
            curr+=down ? 1:-1;

        }
        StringBuilder result = new StringBuilder(); 
        for (StringBuilder row : rows) 
        { result.append(row); } 
        return result.toString();
        
    }
}
```
