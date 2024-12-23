class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp1=0;
        if(b<10){
            temp1=a*10+b;
        }else if(b>=10 && b<100){
            temp1=a*100+b;
        }else if(b>=100 && b<1000){
            temp1=a*1000+b;
        }else if(b>=1000 && b<10000){
            temp1=a*10000+b;
        }
        int temp2=2*a*b;
                        
        answer = temp1>temp2 ? temp1:temp2;
        return answer;
    }
}