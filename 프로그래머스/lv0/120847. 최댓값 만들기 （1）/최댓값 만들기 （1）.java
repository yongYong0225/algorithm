import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //01) 오름차순 정렬후 마지막 & 마지막-1 인덱스 접근해 해결
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]* numbers[numbers.length-2]; 
        return answer;
    }
}