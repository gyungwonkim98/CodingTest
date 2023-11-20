import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        // ArrayList 생성 (크기 지정 없이)
        ArrayList<Integer> answerList = new ArrayList<>();
        
        // 배열 순회
        for (String str : intStrs) {
            int substrInt = Integer.valueOf(str.substring(s,s+l));
            
            if(substrInt>k)
                answerList.add(substrInt);
        }
        
        
        // ArrayList to int[]
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}