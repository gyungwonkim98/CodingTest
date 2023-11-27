class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
            
        int sufLen = is_suffix.length();
        int strLen = my_string.length();
        String splitStr = "";
        
        // is_suffix 길이가 my_string보다 큰경우 실행하지 않음
        if(strLen>=sufLen){
             splitStr = my_string.substring(strLen-sufLen,strLen);
            
             if(splitStr.equals(is_suffix)){
                answer = 1;
             }
        }

        return answer;
    }
}