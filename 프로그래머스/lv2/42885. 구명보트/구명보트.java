import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
            int i = 0;
            int j;

            Arrays.sort(people);

            // 구명보트는 최대 2명
            // 구명보트 무게 제한에 걸리면 1명씩만
            // 가장 무거운 사람, 가벼운사람을 더해서 무게제한에 걸리면 무거운 사람만 먼저 태운다
            // 반복해서 2명이서 탈 수 있으면 같이 태워보낸다

            for(j=people.length-1; i<=j; j--) {
                if(people[j] + people[i] > limit)
                    answer ++;
                else {
                    answer ++;
                    i ++;
                }
            }

            return answer;
    }
}