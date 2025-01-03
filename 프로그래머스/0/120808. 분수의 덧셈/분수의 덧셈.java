class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int temp=0;
        
        if(denom2%denom1==0 && denom2>=denom1){
            answer[0]=numer1*denom2/denom1+numer2;
            answer[1]=denom2;
            for(int i=2;i<=denom2;i++){
                if(answer[0]%i==0 && answer[1]%i==0){
                    answer[0]/=i;
                    answer[1]/=i;
                    i--;
                }                
            }
        }else if(denom1%denom2==0 && denom2<denom1){
            answer[0]=numer2*denom1/denom2+numer1;
            answer[1]=denom1;
            for(int i=2;i<=denom1;i++){
                if(answer[0]%i==0 && answer[1]%i==0){
                    answer[0]/=i;
                    answer[1]/=i;
                    i--;
                }                
            }
        } else {
            for(int i= denom1 >= denom2? denom2*2:denom1*2;;i++){
                if(i%denom1==0 &&i%denom2==0){
                    answer[0]=numer1*i/denom1 + numer2*i/denom2;
                    answer[1]=i;
                    for(int j=2;j<answer[1];j++){
                        if(answer[0]%j==0 && answer[1]%j==0){
                            answer[0]/=j;
                            answer[1]/=j;
                            j--;
                        }                
                    }                   
                    break;
                }
            }
        }
        return answer;
    }
}