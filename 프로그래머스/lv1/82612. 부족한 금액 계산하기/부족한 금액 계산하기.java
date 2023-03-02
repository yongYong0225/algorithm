class Solution {
    public long solution(int price, int money, int count) {
        
       long answer = 0;
        long output = 0;
        for(int i = 1; i<=count; i++){
            output += (price * i);
        }
        if (output <= money)
            return 0;
        return output-money;
    }
}