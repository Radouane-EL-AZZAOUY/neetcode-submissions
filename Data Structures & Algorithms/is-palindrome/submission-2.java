class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();
        int length = s.length();

        int mid = (int) length / 2;
        if (length%2 != 0) mid++;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(length - (i + 1)))
                return false;
        }

        return true;
    }
}
