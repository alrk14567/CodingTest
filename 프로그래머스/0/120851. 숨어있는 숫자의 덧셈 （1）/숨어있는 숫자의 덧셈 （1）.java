class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = my_string.replaceAll("[^0-9]","");//숫자만 
        char[] numArr = num.toCharArray();//배열로 변환
        int[] n =new int[numArr.length];
        for (int i=0;i<n.length;i++){
            n[i]=Character.getNumericValue(numArr[i]);
            answer +=n[i];
        }
        return answer;
    }
}