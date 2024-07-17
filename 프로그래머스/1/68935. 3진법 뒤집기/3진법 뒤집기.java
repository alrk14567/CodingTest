class Solution {
    public int solution(int n) {
       
        String ternaryString = Integer.toString(n, 3);
        
        String reversedString = new StringBuilder(ternaryString).reverse().toString();
        
        // 뒤집힌 3진법 문자열을 10진법 숫자로 변환
        int answer = Integer.parseInt(reversedString, 3);
        
        return answer;
    }
}