class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int rule = 0;

        if(common[2]-common[1] == common[1]-common[0]){
            rule = common[2]-common[1];
            answer = common[(common.length)-1]+rule;
        } else {
            rule = common[2]/common[1];
            answer = common[(common.length)-1]*rule;
        }

        System.out.println(answer);


        return answer;
    }
}