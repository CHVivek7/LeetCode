class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> list = new ArrayList<>();
        key = key.replaceAll(" ", "");
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (!list.contains(ch)) {
                list.add(ch);
            }
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char mch = message.charAt(i);
            int id = list.indexOf(message.charAt(i));

            if (id == -1) {
                str.append(mch);
            } else {
                str.append((char) (id + 'a'));
            }
        }
        return str.toString();
    }
}