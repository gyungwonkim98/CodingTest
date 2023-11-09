class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        answer = new int[num_list.length+1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        int lastNum = num_list[num_list.length-1];
        int num = num_list[num_list.length-2];
        if(lastNum>num){
            answer[num_list.length] =lastNum-num;
        }else{
            answer[num_list.length] =lastNum*2;
        }
        
        return answer;
    }
}