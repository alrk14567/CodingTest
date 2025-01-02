import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                index++;
            }else if(stk.get(stk.size()-1)<arr[i]){
                stk.add(arr[i]);
                index++;
            }else if(stk.get(stk.size()-1)>=arr[i]){
                stk.remove(stk.size() - 1);
                i--;
            }
        }
        
        return stk;
    }
}