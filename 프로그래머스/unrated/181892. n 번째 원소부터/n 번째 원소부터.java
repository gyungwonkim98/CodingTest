import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=n-1; i<num_list.length; i++)
            list.add(num_list[i]);
        
        // list to int[] array
        answer = list.stream().mapToInt(Integer::intValue).toArray(); 
        
        return answer;
    }
}