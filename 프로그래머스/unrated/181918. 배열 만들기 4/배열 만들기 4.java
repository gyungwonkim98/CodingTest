import java.util.Stack;


class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Stack<Integer> stack = new Stack<>();
        
        int i=0; 
        while(i<arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i]);// stack 추가
                i++;
            }else if(stack.peek()< arr[i]){
                stack.push(arr[i]);// stack 추가
                i++;
            }else{
                stack.pop();       // stack 제거
            }
        }
        
        // stack to int[] stk
        stk = new int[stack.size()];
    	for(int j = 0; j < stack.size(); j++)    
            stk[j] = stack.get(j);
 
        return stk;
    }
}