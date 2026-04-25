class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int zeroCount = 0 ,zeroIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                product = product * nums[i];
            }
            else if(nums[i]==0){
                zeroIndex = i;
                zeroCount++;
            }
            
        }
        int[] result = new int[nums.length];
        if(zeroCount == 0){
            for(int j=0 ;j<nums.length; j++){
                result[j] = product/nums[j];
            }

        } else if(zeroCount == 1) {
            result[zeroIndex] = product;
        }
        return result;
    }
}  
