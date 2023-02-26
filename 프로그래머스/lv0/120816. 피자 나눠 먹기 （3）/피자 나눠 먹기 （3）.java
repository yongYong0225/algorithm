class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i=1; i<=50; i++){
            if(n<=slice*i){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}