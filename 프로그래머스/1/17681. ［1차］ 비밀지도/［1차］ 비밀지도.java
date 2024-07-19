import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
                
        for (int i=0;i<n;i++) {
            // 숫자를 2진법으로 변환
            String temp1=Integer.toBinaryString(arr1[i]);
            String temp2=Integer.toBinaryString(arr2[i]);
            // 2진법 스트링 을 문자 배열로 변환
            char[] charArr1=new char[temp1.length()];
            char[] charArr2=new char[temp2.length()];
                        
            for (int j = 0; j < temp1.length(); j++) {
            charArr1[j] = temp1.charAt(j);
            }
            for (int j = 0; j < temp2.length(); j++) {
            charArr2[j] = temp2.charAt(j);
            }
            
            // 스트링 문자 배열을 스트링 지도에 맞게 위치 조정
            char[] chartemp1= new char[n]; 
            char[] chartemp2= new char[n];
            Arrays.fill(chartemp1, '0');
            Arrays.fill(chartemp2, '0');
            for (int j=n-1,k=1;j>=n-temp1.length();j--,k++) {
                chartemp1[j]=charArr1[temp1.length()-k];
            }
            for (int j=n-1,k=1;j>=n-temp2.length();j--,k++) {
                chartemp2[j]=charArr2[temp2.length()-k];

            }
            // 지도 만들기
             String str="";
            for(int j=0;j<n;j++) {
                if((chartemp1[j]=='0')&&(chartemp2[j]=='0')){
                    str+=" ";
                } else{
                    str+="#";
                }
            }
            
            answer[i]=str;           
            
        }
        
        
        return answer;
    }
}