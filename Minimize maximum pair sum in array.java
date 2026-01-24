class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int i =0, j = n-1;
        int res = -1;
        int sum = 0;
        Arrays.sort(nums);
        while(i<j){
            sum = nums[i]+nums[j];
            res = Math.max(res, sum);
            i++;
            j--;

        }

        return res;
    }
}
