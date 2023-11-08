class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddNum="";
        String evenNum="";
        
        for(int i : num_list){
            if(i%2==1){
                oddNum+=Integer.toString(i);
            }else{
                evenNum+=Integer.toString(i);
            }
        }
        
        answer = Integer.parseInt(oddNum)+Integer.parseInt(evenNum);
        return answer;
    }
}