// FOR THAT QUESTION TWO POINTER APPLY ONLY WHEN ARRAY IS SORTED

public class Twosum {
    
    public static int[] twoSum(int []nums, int target){
        int n = nums.length;
        int l = 0,h= n-1;
        int sum = 0;
        while(l<h){
            sum = nums[l]+nums[h];
             if (sum == target) {
                return new int[]{l, h};
            }else if(sum<target){
                l++;
            }else{
                h--;
            }

        }

     return new int[]{l,h};
    }
    
    public static void main(String[] args){
        int[] nums = {2,4,7,8,11};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
