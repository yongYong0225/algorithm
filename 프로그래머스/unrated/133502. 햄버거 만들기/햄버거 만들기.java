import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> making = new ArrayList();

        for (int i=0; i<ingredient.length; i++) {
            making.add(ingredient[i]);
            //햄버거 포장
            if (making.size()>3 &&
                    making.get(making.size()-4)==1 && making.get(making.size()-3)==2 && making.get(making.size()-2)==3 && making.get(making.size()-1)==1) {
                answer++;

                //포장되면 다시 지워줌
                for(int j=0; j<4; j++) {
                    making.remove(making.size()-1);
                }
            }
        }
        return answer;
    }
}