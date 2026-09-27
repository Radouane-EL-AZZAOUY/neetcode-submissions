class Solution {
   public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;

        int alpha1[26] = {0};
        int alpha2[26] = {0};

        for (int i = 0; i < s.length(); i++) {
            alpha1[s[i] - 'a']++;
            alpha2[t[i] - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if (alpha1[j] != alpha2[j])
                return false;
        }
        return true;
    }
};