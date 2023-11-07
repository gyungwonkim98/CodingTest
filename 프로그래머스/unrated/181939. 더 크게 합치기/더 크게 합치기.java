class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
    
        if(num1>=num2){
            answer = num1;
        }else{
            answer = num2;
        }
        
        return answer;
    }
}