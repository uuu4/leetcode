class Solution {
    public int lengthOfLastWord(String s) {
        String[] tokens = s.split(" ");
        return tokens[tokens.length - 1].length();
    }
}
