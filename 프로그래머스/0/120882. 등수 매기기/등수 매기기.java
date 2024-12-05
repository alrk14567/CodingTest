import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] temp1=new int[score.length];
        int[] temp2=new int[score.length];
        int index=temp1.length-1;
        
        for(int i=0;i<temp1.length;i++){
            temp1[i]=score[i][0]+score[i][1];
        }        
        Arrays.sort(temp1);//순서 고
        
        for(int i=0;i<temp2.length;i++){
            temp2[i]=temp1[index--];
        }       
            
        for(int i=0;i<temp2.length;i++){//원래 점수 배열
            for(int j=0;j<temp2.length;j++){ //temp 랭킹 체크
                if(temp2[j]==score[i][0]+score[i][1]){
                    answer[i]=j+1;
                    break;
                }
            }            
        }
        
        
        
        
        return answer;
    }
}