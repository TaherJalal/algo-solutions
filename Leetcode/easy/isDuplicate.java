class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        boolean ans = false;
        for(int n : nums){
            if(set.contains(n)){
                ans = true;
                break;
            }
            else{
                set.add(n);
            }
        }
        return ans;
    }
}