class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0 ; i<nums.length;i++){
            int count = 0;
            for(int j =i+1; j<nums.length ;j++){
                if(nums[i]==nums[j]){
                    count ++;
                    return true;
                }
            }

        }
        return false;
    }
}