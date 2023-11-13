import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (n>=1){
            list.add(n);
            
            if(n==1){
                break;
            }else if(n%2==0){
                n= n / 2;
            }else{
                n= 3 * n + 1;
            }
           
        }
        
        // list to int[] array
        answer =  new int[list.size()];
        for(int idx=0; idx < list.size(); idx++){
           answer[idx]  = (int)list.get(idx);
        }

        return answer;
    }
}