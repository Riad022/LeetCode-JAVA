class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] string = new int[26];

        for (int i = 0; i < s.length(); i++) {
            string[s.charAt(i) - 'a']++;
            string[t.charAt(i) - 'a']--;
        }

        for (int n : string) if (n != 0) return false;

        return true;
    }
}
