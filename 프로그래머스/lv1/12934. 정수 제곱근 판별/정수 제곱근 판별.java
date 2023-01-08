class Solution {
    public long solution(long n) {
        
        double result = Math.sqrt(n);
        long result2 = (long)result;

        if(result > result2){
            return -1;
        } else {
            long answer = (result2+1)*(result2+1);
            return answer;
        }
        
    }
}