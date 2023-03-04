import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<=A.length-1; i++){
            answer=answer+(A[i]*B[A.length-i-1]);
        }

        System.out.println(answer);

        //5 24 8 = 37
        //6 20 8 = 34

        return answer;
    }
}