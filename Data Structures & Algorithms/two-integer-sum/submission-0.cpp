class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> indices;
        int length = nums.size();
        for (int i = 0; i < length-1; i++) 
        {
            for (int j = i+1; j < length; j++) 
            {
                if ((nums[i] + nums[j]) == target)
                {
                    indices.push_back(i);
                    indices.push_back(j);
                    return indices;
                }
            }
        }
    }
};
