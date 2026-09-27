class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> staging_s = new HashMap<>();
        Map<Character, Integer> staging_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            staging_s.put(c, staging_s.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            staging_t.put(c, staging_t.getOrDefault(c, 0) + 1);
        }

        return staging_s.equals(staging_t);
    }
}
