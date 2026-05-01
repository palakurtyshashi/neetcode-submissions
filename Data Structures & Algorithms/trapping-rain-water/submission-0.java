class Solution {
    public int trap(int[] height) {
        
        int res = 0;
        int l = 0, r = height.length;

        int leftMax = height[0], rightMax = height[r-1];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res = res + (leftMax - height[l]);
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }

    return res;
    }
}
