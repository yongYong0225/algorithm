class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cntP = 0;
        int cntY = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.toLowerCase().charAt(i)=='p'){
                cntP += 1;
            } else if (s.toLowerCase().charAt(i)=='y') {
                cntY += 1;
            }
        }
        
        if(cntP!=cntY){
            return !answer;
        } else {
            return answer;
        }

        
    }
}