class Solution {
    public int[] solution(String[] keyinput, int[] board) {
    int[] answer = new int[2];
        int x = board[0]/2;
        int y = board[1]/2;
        //up은 +1 down -1 (answer[1])
        //left -1 right +1 (answer[0])
        for(int i=0; i<=(keyinput.length)-1; i++){
            switch (keyinput[i]){
                case "left":
                    answer[0] -= 1;
                    if(answer[0]<x*-1){
                        answer[0] = x*-1;
                    }
                    break;
                case "right":
                    answer[0] += 1;
                    if(answer[0]>x){
                        answer[0] = x;
                    }
                    break;
                case "up":
                    answer[1] += 1;
                    if(answer[1]>y){
                        answer[1] = y;
                    }
                    break;
                case "down":
                    answer[1] -= 1;
                    if(answer[1]<y*-1){
                        answer[1] = y*-1;
                    }
                    break;
            }
        }
        return answer;
    }
}