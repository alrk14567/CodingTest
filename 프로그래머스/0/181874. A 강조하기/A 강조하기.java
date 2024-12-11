class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr=myString.split("");
        
        for(int i=0; i<strArr.length;i++){
            if(strArr[i].equals("a")){
                answer+="A";
            }else if(strArr[i].equals("A")){
                answer+="A";
            }else{
                answer+=strArr[i].toLowerCase();
            }
        }
        
        return answer;
    }
}