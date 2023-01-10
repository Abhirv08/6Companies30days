Question: https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/

class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < cards.length; i++){
            if(map.containsKey(cards[i])){
                min = Math.min(min, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

TC - O(n)
SC - O(n)
