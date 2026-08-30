class Solution {
   public:
    bool hasDuplicate(vector<int>& nums) {
        int len = nums.size();
        set<int> uniques;
        for (int i = 0; i < len; i++) {
            uniques.insert(nums[i]);
        }
        if (uniques.size() < len) {
            return true;
        }
        return false;
    }
};