class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int index = str.indexOf("#", i);
            int number = Integer.valueOf(str.substring(i, index));
            System.out.println(number);
            i += str.substring(i, index).length() + 1;

            String text = str.substring(i, i + number);
            System.out.println(text);
            list.add(text);
            i += number;
        }

        return list;
    }
}
