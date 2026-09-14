class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length;
        int[] suffix = new int[length];
        int[] prefex = new int[length];
        int[] output = new int[length];

        prefex[0] = 1;
        suffix[0] = 1;
        for (int i = 1; i < length; i++) {
            prefex[i] = prefex[i-1]*nums[i-1];
            suffix[i] = suffix[i-1]*nums[length-i];
        }

        for (int i = 0; i < length; i++)
            output[i] = prefex[i]*suffix[length-i-1];

        return output;
    }
}  
