class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
     
        /** 오답코드 
            입력값 〉	"aaaaaa", "bbb", 3
            기댓값 〉	"aaabbb"
            실행 결과 〉	실행한 결괏값 "bbbbbb"이 기댓값 "aaabbb"과 다릅니다.
   
          String replStr = my_string.substring(s,s+overwrite_string.length());
          String answer = my_string.replace(replStr, overwrite_string);
        */
        
        
        String startStr = my_string.substring(0,s);
        String endStr = my_string.substring(s+overwrite_string.length(),my_string.length());
        
        answer = startStr + overwrite_string + endStr;
        return answer;
    }
}