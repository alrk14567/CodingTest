import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int indx=0;
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]){
                answer[indx++]=todo_list[i];
                
            }
        }
        return Arrays.copyOf(answer, indx);
    }
}