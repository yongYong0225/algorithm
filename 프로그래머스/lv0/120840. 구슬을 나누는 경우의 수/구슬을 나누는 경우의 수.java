class Solution {
    static long C(int x, int y){
        long [] a = new long[y];
        long [] b = new long[y];
        long tmp_x=x;
        long tmp_y=y;
        for(int i=0;i<y;i++){
            a[i]=tmp_x;
            tmp_x--;
        }
        for(int i=0;i<y;i++){
            b[i]=tmp_y;
            tmp_y--;
        }
        for(int i=0;i<y;i++){
            for(int j=0;j<y;j++){
                if(a[i]%b[j]==0){
                    a[i]=a[i]/b[j];
                    b[j]=1;
                }
            }
        }
        long val_a=1;
        long val_b=1;
        for(int i=0;i<y;i++){
            val_a*=a[i];
        }
        for(int i=0;i<y;i++){
            val_b*=b[i];
        }
        return val_a/val_b;
    }
    public long solution(int balls, int share) {
        long answer = C(balls, share);
        return answer;
    }
}
