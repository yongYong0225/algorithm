import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        int cnt = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){

            if(participant[i].equals(completion[i])){
                cnt++;
            } else {
                break;
            }
        }


            answer = participant[cnt];
        
        return answer;
    }
}
//없는사람은 무조건 한명
//배열 정렬후 i번째 없는사람이 범인
//123456
//23456