class Solution {
    public int[] twoSum(int[] nums, int target) {

    Map<Integer,Integer> myMap = new HashMap<>();

    for (int i=0; i < nums.length ; i++ ){
        int diff = target - nums[i];
        if(myMap.get(diff) != null){
           return new int[]{myMap.get(diff),i};
        }
        else {
            myMap.put(nums[i],i);
        }
    }
    return new int[]{0,0};
    }
}
