import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr) list.add(i);

        for(int idx =0 ; idx<query.length; idx++){
            // 새로운 ArrayList를 생성하여 부분 리스트를 복사하여 추가
            ArrayList<Integer> copiedList = new ArrayList<>();
            if(idx%2==0){
                //짝수인덱스
                copiedList.addAll(list.subList(0, query[idx] + 1));
                list.clear();
                list = copiedList;
            }else{
                //홀수인덱스
                copiedList.addAll(list.subList(query[idx], list.size()));
                list.clear();
                list = copiedList;
            }
            
        }
     
        // list to int[] array
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}