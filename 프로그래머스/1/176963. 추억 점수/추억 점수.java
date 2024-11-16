class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        
        for (int i=0; i<photo.length;i++) {//전체 포토 사진에서 몇번째 사진을 확인하는지
            for (int j=0; j<name.length;j++) {//점수 체크??
                for (int k=0; k<photo[i].length;k++) {//사진에서 해당하는 점수 있으면 더하기
                    if(photo[i][k].equals(name[j])){
                        answer[i] +=yearning[j];
                    } else {
                        answer[i] +=0;
                    }
                }
            }
        }
        
        return answer;
    }
}