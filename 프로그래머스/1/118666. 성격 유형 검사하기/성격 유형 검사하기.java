class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] alphabet = new int[26];

        for (int i = 0; i < survey.length; i++) {
            int num = choices[i];

            if (num < 4) {
                alphabet[survey[i].charAt(0) - 'A'] += (4 - num);
            } else if (num > 4) {
                alphabet[survey[i].charAt(1) - 'A'] += (num - 4);
            }
        }

        String[] strArr = {"RT", "CF", "JM", "AN"};
        StringBuilder sb = new StringBuilder();

        for (String str : strArr) {
            char c1 = str.charAt(0);
            char c2 = str.charAt(1);

            if (alphabet[c1 - 'A'] >= alphabet[c2 - 'A']) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }

        return sb.toString();
    }
}