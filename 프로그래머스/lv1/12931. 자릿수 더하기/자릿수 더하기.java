import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = ""+n;
        int[] arr = new int[num.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = num.charAt(i)-'0';
        }

        for(int i:arr){
            answer += i;
        }

        return answer;
    }
}