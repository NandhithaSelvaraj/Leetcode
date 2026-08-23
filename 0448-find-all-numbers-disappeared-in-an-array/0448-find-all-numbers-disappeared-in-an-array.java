class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        for(int x : nums){
            seen[x - 1] = true;
        }
        for  (int i=0; i<seen.length; i++){
            if(!seen[i]){
                ans.add(i +1);
            }
        }
        return ans;
    }
}