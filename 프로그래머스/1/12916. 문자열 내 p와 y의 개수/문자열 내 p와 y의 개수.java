class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] Arr=new char[s.length()];
        Arr=s.toCharArray();
        int countP=0;
        int countY=0;
        
        for(int i=0;i<s.length();i++) {
            if(Arr[i]=='y'|| Arr[i]=='Y'){
                countY++;               
            }
            if(Arr[i]=='p' || Arr[i]=='P'){
                countP++;
            }
        }
        if (countP==countY){
            answer=true;
        } else{
            answer=false;
        }
        
        return answer;
    }
}