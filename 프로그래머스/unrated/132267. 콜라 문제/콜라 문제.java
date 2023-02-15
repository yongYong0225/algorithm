class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //a는 줘야하는 콜라, b는 받는 콜라, n은 빈콜라

        while (a<=n){
            answer += (n/a)*b;
            int r = n%a;

            n = (n/a)*b + r;
        }
        System.out.println(answer);
        return answer;
    }
}