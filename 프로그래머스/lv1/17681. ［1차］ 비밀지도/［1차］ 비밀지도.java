class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //arr1과  2의 숫자를 2진법으로 변경
        //두 배열을 더해서 0보다 크면 # 아니면 1
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String result = "";

            String num1 = Integer.toBinaryString(arr1[i]);
            String num2 = Integer.toBinaryString(arr2[i]);

            for (int j = 0; j < n; j++) {
                if (num1.length() < n) { //01101로 나와야 하는데 1101 등으로 나올 경우
                    num1 = "0" + num1;
                }
                if (num2.length() < n) {
                    num2 = "0" + num2;
                }
                if (num1.charAt(j) == '1' || num2.charAt(j) == '1') { //둘중 하나라도 1이라면 #
                    result += "#";
                } else if (num1.charAt(j) == '0' && num2.charAt(j) == '0') { //둘다 0이라면 공백
                    result += " ";
                }
            }
            answer[i] = result;
            System.out.println(result);


        }
        return answer;
    }
}
