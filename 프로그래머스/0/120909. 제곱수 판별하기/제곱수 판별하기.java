class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i =0;i<1001;i++){
            if(i*i==n){
                answer=1;
            }
        }
        if(answer==0){
            answer=2;
        }
        return answer;
    }
}