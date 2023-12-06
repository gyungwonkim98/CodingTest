import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        
        // int arrayList 생성
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        
        for(int i=start; i>=end_num; i--){
            intArr.add(i);
        }
        
        // ArrayList to int[]
       answer= new int[intArr.size()];
       for (int i = 0 ; i < intArr.size() ; i++) 
            answer[i] = intArr.get(i).intValue();
        return answer;
    }
}