class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length-1;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int need = -(nums[i]+nums[j]);
                if(seen.contains(need)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], need);
                    Collections.sort(temp);
                    set.add(temp);
                    
                }
                seen.add(nums[j]);

            }
            
            
        }
        return new ArrayList<>(set);
    }
}
