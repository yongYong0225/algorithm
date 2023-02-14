class Solution {
    public int[] solution(int brown, int yellow) {
       int[] answer = new int[2];
        int sum = brown+yellow;
        int width = 0;
        int height = 0;
        //총면적 = brown+yellow = width*height
        //yellow = (width-2)*(height-2)
        // 1 12, 2 6, 3 4, (4 3), 6 2, 12 1

        for(int i = 1; i<=sum; i++) {
            height = i; //세로
            width = sum/height; //가로

            if(height>width){
                continue;
            }

            if(yellow == (width-2)*(height-2)){
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }
}