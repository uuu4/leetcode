import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        
        int n = deck.length;
        Queue<Integer> indexQueue = new LinkedList<>(); 
        

        for (int i = 0; i < n; i++) {
            indexQueue.offer(i);
        }
        
        int[] result = new int[n];
        

        for (int card : deck) {
            result[indexQueue.poll()] = card;
            if (!indexQueue.isEmpty()) {
                indexQueue.offer(indexQueue.poll());
            }
        }
        
        return result;
    }
}
