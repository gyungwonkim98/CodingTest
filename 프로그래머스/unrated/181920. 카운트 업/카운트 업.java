class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        int len = end_num-start_num+1;
        answer = new int[len];
        
        for(int i=0; i<len; i++){
            answer[i]=start_num;
            start_num+=1;
        }
        
        return answer;
    }
}