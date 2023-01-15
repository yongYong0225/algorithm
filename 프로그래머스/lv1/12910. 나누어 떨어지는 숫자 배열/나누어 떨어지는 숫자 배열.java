import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        int a = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[a] = arr[i];
                a++;
            }
        }
        if(a==0){
            answer = new int[]{-1};
        }

        Arrays.sort(answer);
        return answer;
    }
}