class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index=0;
        if(numbers.length%2==0){
            for(int i=0; i<k;i++){
                answer =numbers[index];
                index +=2;
                if(index>numbers.length-1){
                    index =0;
                }
            }
        } else if (numbers.length%2==1){
            int roundNum=0;
            for(int i=0; i<k;i++){
                answer =numbers[index];
                index +=2;
                if(index>numbers.length-1){
                    roundNum++;
                    if(roundNum%2==0){
                        index =0;
                    }else {
                        index =1;
                    }                    
                }
            }
        }
        return answer;
    }
}