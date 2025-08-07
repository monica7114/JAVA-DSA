class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int pos=0;
        for(int i =0;i<nums.length;i++){
          if(nums[i]!=0){
            temp=nums[pos];
            nums[pos]=nums[i];
            nums[i]=temp;
            pos++;

          }
    }
    }
}
