class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String tmp : strs) {
            String sorted = tmp.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
            if (map.containsKey(sorted)) {
                map.get(sorted).add(tmp);
            }
            else {
                List<String> arr = new ArrayList<>();
                arr.add(tmp);
                map.put(sorted, arr);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
