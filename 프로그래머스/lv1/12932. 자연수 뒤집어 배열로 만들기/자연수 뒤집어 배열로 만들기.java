class Solution {
    public int[] solution(long n) {
        
        String num = ""+n;
        int[] arr = new int[num.length()];
        int[] answer = new int[num.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = num.charAt(i)-'0';
        }

        for(int i=0; i<arr.length; i++){
            answer[(answer.length)-1-i] = arr[i];
        }
        
        return answer;
    }
}