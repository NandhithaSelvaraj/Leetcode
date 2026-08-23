class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;
        boolean[] seen = new boolean[nums.length];
        for (int x : nums){
            if (seen[x -1]){
                duplicate = x;
            }else {
                seen[x -1] = true;
            }
        }
        for (int i = 0; i<seen.length;i++){
            if(!seen[i]){
                missing = i + 1;
            }
        }
        return new int[]{duplicate,missing};
    }
}