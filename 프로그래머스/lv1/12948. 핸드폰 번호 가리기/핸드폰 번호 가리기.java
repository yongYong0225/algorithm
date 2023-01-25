class Solution {
    public String solution(String phone_number) {
        
        String num = phone_number.substring(phone_number.length()-4);
        String star = phone_number.substring(0, phone_number.length()-4);
        String star2 = star.replaceAll(".","*");
        
        String answer = star2+num;
        return answer;
    }
}