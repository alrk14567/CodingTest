class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1=String.valueOf(a)+String.valueOf(b);
        String str2=String.valueOf(b)+String.valueOf(a);
        int temp1=Integer.parseInt(str1);
        int temp2=Integer.parseInt(str2);
        
        answer= temp1>=temp2 ? temp1:temp2;
        
        return answer;
    }
}