class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

    for (String tmp : strs) {
        int[] freq = new int[26];
        for (char c : tmp.toCharArray()) {
            freq[c - 'a']++;
        }
        String key = Arrays.toString(freq); // e.g. "[1,1,0,...,0]"
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(tmp);
    }

    return new ArrayList<>(map.values());
    }
}
