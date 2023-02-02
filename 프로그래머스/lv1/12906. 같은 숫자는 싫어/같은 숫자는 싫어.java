import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int num = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=num){
                arr1.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[arr1.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = arr1.get(i);
        }
        return answer;
    }
}