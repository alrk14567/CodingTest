import java.util.*;

class Solution {
    public int[] solution(int[] answers) {        
        
        int[] num1=new int[answers.length];
        int[] num2=new int[answers.length];
        int[] num3=new int[answers.length];
        int[] score = new int[3];
        
        for(int i=0;i<num1.length;i++){   // 각 사람의 답안지
            num1[i]=i%5+1;  //num1
            
            if(i%8==0 || i%8==2|| i%8==4|| i%8==6){  //num2
                num2[i]=2;
            }else if(i%8==1){
                num2[i]=1;
            }else if(i%8==3){
                num2[i]=3;
            }else if(i%8==5){
                num2[i]=4;
            }else{
                num2[i]=5;
            }
            
            if(i%10==0 || i%10==1){
                num3[i]=3;
            }else if(i%10==2 || i%10==3){
                num3[i]=1;
            }else if(i%10==4 || i%10==5){
                num3[i]=2;
            }else if(i%10==6 || i%10==7){
                num3[i]=4;
            }else{
                num3[i]=5;
            }
            
            if(answers[i]==num1[i]){
                score[0]++;
            }
            if(answers[i]==num2[i]){
                score[1]++;
            }
            if(answers[i]==num3[i]){
                score[2]++;
            }
        }
        
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);
        int N=0;
        for (int i=0;i<3;i++){
            if(score[i]==temp[2]){
                N++;
            }    
        }
        int j=0;
        int[] answer=new int[N];
        for (int i=0;i<3;i++){
            if(score[i]==temp[2]){
                answer[j++]=i+1;
        }
        }
            return answer;
        }
}