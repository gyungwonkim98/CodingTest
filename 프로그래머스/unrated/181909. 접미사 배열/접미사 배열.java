import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};

        // ArrayList 생성 (크기 지정 없이)
        ArrayList<String> answerList = new ArrayList<>();
        int strLen = my_string.length();
        
        for(int i=strLen; i > 0 ; i--){
            answerList.add(my_string.substring(strLen-i, strLen));
        }
        
        
        // ArrayList to String[]
        Collections.sort(answerList);
        answer = answerList.toArray(new String[0]);
        return answer;
    }
}