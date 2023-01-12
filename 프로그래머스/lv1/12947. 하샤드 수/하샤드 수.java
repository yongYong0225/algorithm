class Solution {
    public boolean solution(int x) {
        
        boolean answer = true;
        String num = ""+x;
        int sum = 0;

        for(int i=0; i<num.length(); i++){
            sum += num.charAt(i)-'0';
        }

        if(x%sum==0){
            return answer;
        } else{
            return !answer;
        }
    }
}