class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> staging_s = new HashMap<>();
        // Map<Character, Integer> staging_t = new HashMap<>();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            staging_s.put(c, staging_s.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            staging_s.put(c, staging_s.getOrDefault(c, 0) - 1);
        }

        for (int i : staging_s.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
