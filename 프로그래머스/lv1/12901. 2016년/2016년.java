class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int date = 0;

//1 8
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<a-1; i++){
            date += month[i];
        }
        date += b-1;
        answer += days[date%7];
        
        return answer;
    }
}