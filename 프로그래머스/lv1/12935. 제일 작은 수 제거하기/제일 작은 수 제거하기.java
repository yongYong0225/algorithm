class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        //배열길이가 1보다 클 때
        //가장 작은 수를 뺀 길이로 초기화
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; //하나의 값을 기준으로 잡음.
        //제일 작은 수를 구한다.
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        
        //반복문 index 용
        int index = 0;
        
        //가장 작은 수를 제외한 배열 만들기
        for(int i=0; i<arr.length; i++){
            //배열의 값이 가장 작은 수라면
            if(arr[i] != min){
                answer[index++] = arr[i];
            }
            
        }
        
        return answer;
    }
}

//int[]의 배열길이가 1이면 [-1] 리턴
//그게 아니라면 가장 작은 수를 찾아야함