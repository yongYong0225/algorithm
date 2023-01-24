class Solution {
    public int solution(int[][] sizes) {
        
        int answer = 0;
        int w = 0;
        int h = 0;
        
        //가로길이보다 세로길이가 길때 두 값 서로 바꿔주기
        //가로>세로 값으로 고정
        for(int i=0; i<sizes.length; i++){
            int temp = 0;
            if(sizes[i][0]<sizes[i][1]){
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        //가로변과 세로변에서 가장 큰 수 가져오기
        for(int i=0; i< sizes.length; i++){
                w = Math.max(sizes[i][0], w);
                h = Math.max(sizes[i][1], h);
        }
        //가로*세로        
        answer = w*h;
        return answer;
    }
}