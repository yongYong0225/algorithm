class Solution {
    public int solution(int[] array) {
        int answer = 0;

        int[] count=new int[1000];

        for(int j=0; j<array.length; j++) {
            count[array[j]]++;                    //새로 만든 배열에 1을 더해줌
        }

        int max=0;
        for(int m=0; m<count.length; m++) {     //새로만든 배열의 최대값을 구함
            if(count[m]>max) {
                max=count[m];              //새로만든 배열의 m번째 요소가 최대값이라면
                answer=m;                       //매개변수로 들어온 배열의 m 이 최빈값
            }
        }

        int dup = 0;

        for(int n=0; n<count.length; n++) {     //그 최대값이 중복으로 있는지를 확인    
            if(max==count[n]) {            //중복이 없다면 rep는 1,
                dup++;                          //중복이 있다면 reo는 2이상
            }
        }

        if(dup!=1) {
            answer=-1;
        } 
            return answer;
}
}