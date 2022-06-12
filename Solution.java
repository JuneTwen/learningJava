class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        if(sum - nums[0] == 0){
            return 0;
        }
        int left = 0;
        int right = sum;
        for(int i = 0;i < nums.length-1;i++){
            right = right - nums[i];
            left += nums[i];
            if(left == right - nums[i+1]){
                return i+1;
            }
        }
        if(sum - nums[nums.length-1] == 0){
            return nums.length-1;
        }
        return -1;
    }
}
