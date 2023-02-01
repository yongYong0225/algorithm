class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] word = s.split("");


        for(int i=0; i< word.length; i++){
            if(word[i].equals(" ")){
                idx = 0;
            } else if(idx%2==0){
                word[i] = word[i].toUpperCase();
                idx++;
            } else {
                word[i] = word[i].toLowerCase();
                idx++;
            }
            answer += word[i];
        }
        
        return answer;
    }
}