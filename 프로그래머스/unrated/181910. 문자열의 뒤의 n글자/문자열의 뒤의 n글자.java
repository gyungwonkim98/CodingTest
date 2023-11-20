class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int strLen = my_string.length();
        answer = my_string.substring(strLen-n,strLen);
        
        return answer;
    }
}