class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int exchange = (n/a)*b;
            
            answer+= (n/a)*b;
            n= (n%a)+exchange;
            
        }      
        return answer;
    }
}