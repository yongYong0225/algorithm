class Solution {
    public int solution(String s) {
        int answer = 0;


        String[] array = s.split(" ");


        for(int i=0; i<=(array.length)-1; i++){
            if(array[i].equals("Z")){
                answer -= Integer.parseInt(array[i-1]);
            } else {
                answer += Integer.parseInt(array[i]);
            }
        }
        System.out.println(answer);

        return answer;
    }
}