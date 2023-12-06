import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=l; i<=r; i++){
            if(i%5!=0){
                continue;
            }else{
                    String str = i+"";
                    final String REGEX = "^[05]*$";
                
                    if(str.matches(REGEX)) {
                      list.add(i);
                    }
            }
        }

        // list에 값이 없다면 -1 삽입
        if(list.size() == 0){
            list.add(-1);
        }
        // list to int[] array
        answer =  new int[list.size()];
        for(int idx=0; idx < list.size(); idx++){
           answer[idx]  = (int)list.get(idx);
        }
        
        return answer;
    }
}