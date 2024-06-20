class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String number=Integer.toString(x);
        char[] charArray=number.toCharArray();
        int[] numbers=new int[charArray.length];
        int sum=0;
        
        for(int i=0;i<charArray.length;i++){
            numbers[i]=Character.getNumericValue(charArray[i]);
            sum+=numbers[i];
        }
        if (x%sum==0){
            answer=true;
        } else{
            answer=false;
        }
        
        return answer;
    }
}