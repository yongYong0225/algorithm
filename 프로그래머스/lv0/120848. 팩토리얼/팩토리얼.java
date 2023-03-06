class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int num = 1;
        
        while(num<=n){
            num *= i;
            i++;
        }
        //1 1 | 1 2 | 2 3| 6|4 |
        answer = i-2;
        return answer;
    }
}