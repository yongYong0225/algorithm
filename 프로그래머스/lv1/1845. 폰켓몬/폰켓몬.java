import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pok = nums.length/2;

        // 중복제거하기
        HashSet<Integer> pm = new HashSet<>();

        for (int num : nums) {
            pm.add(num);
        }


        if (pm.size() > pok) {
            System.out.println(pok);
            return pok;
        } else {
            System.out.println(pm.size());
            return pm.size();
        }
    }
}