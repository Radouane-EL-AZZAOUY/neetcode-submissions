class Solution {
    private String isAnagram(String str) {
        return str.chars()
            .sorted()
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> pout = new HashMap<>();
        for (String s : strs) {
            String key = isAnagram(s);
            if (pout.get(key) == null)
                pout.put(key, new ArrayList<>(Arrays.asList(s)));
            else
                pout.get(key).add(s);
        }
        return new ArrayList<>(pout.values());
    }
}
