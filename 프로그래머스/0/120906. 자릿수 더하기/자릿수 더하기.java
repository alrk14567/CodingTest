class Solution {
    public int solution(int n) {
        int answer = 0;
        int sizeN =0;
        int temp =n;
        while(temp/10!=0){
            sizeN++;
            temp/=10;
        }
        int[] nArr=new int[sizeN];
        
        for(int i=0;i<sizeN;i++){
            answer+=n%10;
            n/=10;
        }
        answer+=temp;
        
        
        return answer;
    }
}