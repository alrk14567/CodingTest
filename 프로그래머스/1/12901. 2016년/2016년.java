class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int temp=30*(a-1)+b;
        int[] daysMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int totalDays=0;
        for (int i=1; i< a; i++){
            totalDays +=daysMonth[i];
        }
        totalDays +=b;
        answer = daysWeek[totalDays % 7];
            
        
                    
        return answer;
    }
}