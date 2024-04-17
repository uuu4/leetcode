class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>(words.length);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
}
