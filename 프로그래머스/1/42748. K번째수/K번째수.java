import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp={};
        for (int a=0; a<commands.length;a++) {
            int digit=0;
            temp= new int[commands[a][1]-commands[a][0]+1]; 
            for (int b=commands[a][0]-1; b<commands[a][1];b++) {                             
                temp[digit++]=array[b];
            }
            Arrays.sort(temp);
            answer[a]=temp[commands[a][2]-1];
        }
        
        return answer;
    }
}