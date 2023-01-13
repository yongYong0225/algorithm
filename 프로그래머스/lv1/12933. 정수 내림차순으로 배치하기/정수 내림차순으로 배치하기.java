import java.util.*;

class Solution {
    public long solution(long n) {
        
        long answer = 0;
        String num = ""+n;
        Integer[] arr = new Integer[num.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = num.charAt(i)-'0';
        }

        Arrays.sort(arr, Collections.reverseOrder());
        
        String rnum = "";
        for(int i=0; i<arr.length; i++){
            rnum += arr[i];
        }

        answer = Long.parseLong(rnum);
        
        return answer;
    }
}