class Solution {
    public long solution(int a, int b) {
        
        long answer = 0;

        if(a==b){
            return a;
        } else if(a<b){
            for(int i=a; i<=b; i++){
                answer += i;
            }
        } else if (a>b) {
            for(int i=b; i<=a; i++){
                answer += i;
            }
                
        }
        return answer;
    }
}

/* for문 안에 삼항연산자
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}
*/