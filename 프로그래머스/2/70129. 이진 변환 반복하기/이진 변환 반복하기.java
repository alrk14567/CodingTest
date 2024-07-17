class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int count=0;
        int tryNumber=0;
        while(true){
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    count++;
                }
                
            }            
            String sWithoutZeros=s.replace("0","");
            int sLength=sWithoutZeros.length();
            s=Integer.toBinaryString(sLength);
            tryNumber++;
            if(s.equals("1")){
                answer = new int[] {tryNumber, count};
                break;
            }
            
            
        }
        
        return answer;
    }
}