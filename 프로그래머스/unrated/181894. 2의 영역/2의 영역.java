import java.util.ArrayList;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int idx=0; idx<arr.length; idx++){
            if(arr[idx]==2){
                list.add(idx);
            }
        }
        
        // arr 순회하며 필요한 값만 list2에 저장
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        if(list.size()==0){
            list2.add(-1);
        }else{
            int startIdx = list.get(0);
            int endIdx = list.get(list.size()-1);


            for(int idx=startIdx; idx<=endIdx; idx++){
                list2.add(arr[idx]);
            }
        }
        
        // list to int[] array
        answer =  new int[list2.size()];
        for(int idx=0; idx < list2.size(); idx++){
           answer[idx]  = (int)list2.get(idx);
        }
        
        return answer;
    }
}