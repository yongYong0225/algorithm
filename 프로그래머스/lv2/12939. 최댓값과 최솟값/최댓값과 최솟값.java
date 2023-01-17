class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] num = s.split(" ");
        int max = Integer.parseInt(num[0]);
        int min = Integer.parseInt(num[0]);


        for(int i=0; i<num.length; i++){

            if(max<Integer.parseInt(num[i])){
                max = Integer.parseInt(num[i]);

            } else if(min>Integer.parseInt(num[i])){
                min = Integer.parseInt(num[i]);
            }
            answer = min + " " + max;
        }
        
        return answer;
    }
}