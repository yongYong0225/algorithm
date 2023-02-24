class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;


        for(int j = left; j<=right; j++){

            for(int i=1; i<=j; i++){
                if(j%i == 0){
                    cnt += 1;
                }
            }
            if(cnt%2 == 0){
                answer += j;
            } else {
                answer -= j;
            }
            cnt = 0;

        }


        System.out.println(answer);
        return answer;
    }
}