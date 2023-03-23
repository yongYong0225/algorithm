class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int cnt = 0;
        int max = 0;
        
        for(int i=0; i<=array.length-1; i++){
            if(max<array[i]){
                max = array[i];
                answer[1] = cnt;
            }
            cnt++;
        }
        answer[0] = max;
        return answer;
    }
}