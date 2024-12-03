class Solution {
    public int[][] solution(int[][] arr) {
        int index=arr.length>=arr[0].length ? arr.length:arr[0].length;
        int[][] answer=new int[index][index];
        
        if(arr.length==arr[0].length){        
            answer=arr;
        }else if (arr.length>arr[0].length){
            for(int i=0;i<answer.length;i++){
                for(int j=0;j<answer.length;j++){
                    if(j<arr[0].length){
                        answer[i][j]=arr[i][j];
                    }else{
                        answer[i][j]=0;
                    }                    
                }
            }
        }else{            
             for(int i=0;i<answer.length;i++){
                for(int j=0;j<answer.length;j++){
                    if(i<arr.length){
                        answer[i][j]=arr[i][j];
                    }else{
                        answer[i][j]=0;
                    }
                }
            }
        }
        
        return answer;
    }
}