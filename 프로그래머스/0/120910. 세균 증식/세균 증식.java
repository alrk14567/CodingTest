class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer=2*n;
        for(int i=2;i<=t;i++){
            answer*=2;
        }
        return answer;
    }
}