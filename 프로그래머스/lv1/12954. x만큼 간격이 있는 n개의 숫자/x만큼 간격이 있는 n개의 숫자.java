class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        long j = 0;
        
        //x가 x씩 n만큼 반복
        
        for(int i=0; i<n; i++){
            j += x;
            //계산이 끝나면 배열 i번째에 j를 넣어준다
            answer[i] = j;
        }
        
        return answer;
    }
}