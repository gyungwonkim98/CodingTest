import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        
        for (int i=1; i<=n; i++){
            if(i%k == 0){
              intArr.add(i);
            }
        }
        
        
       // ArrayList to int[]
       answer= new int[intArr.size()];
       for (int i = 0 ; i < intArr.size() ; i++) 
            answer[i] = intArr.get(i).intValue();
        return answer;
    }
}
