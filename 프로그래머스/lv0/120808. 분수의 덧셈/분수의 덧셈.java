class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 1;

        //분모를 합치고
        //더하기
         if(denom2%denom1==0 || denom1==denom2){
            int j = denom2/denom1;
            answer[0] = (numer1*j)+numer2;
            answer[1] = denom2;
        } else {
            answer[0] = (numer1*denom2)+(numer2*denom1);
            answer[1] = denom1*denom2;
        }
        for(int i=1; i<=answer[0] && i<=answer[1]; i++){
            if(answer[0]%i==0 && answer[1]%i ==0){
                max = i;
            }
        }
        answer[0] /= max;
        answer[1] /= max;

        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }
}