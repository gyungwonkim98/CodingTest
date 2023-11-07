class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mul = 1;
        int sum = 0;
        
        for(int i : num_list){
            mul *= i;
            sum += i;
        }

        answer = mul < Math.pow(sum,2)? 1:0;
        return answer;
    }
}