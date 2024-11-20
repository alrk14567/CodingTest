class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] digits = num.chars().map(Character::getNumericValue).toArray();
        int[] answer = new int[digits.length];
        for (int i=0;i<digits.length;i++){
            answer[i]=digits[digits.length-(1+i)];
        }
        
        return answer;
    }
}