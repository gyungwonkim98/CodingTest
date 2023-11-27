class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int strLen = my_string.length();
          StringBuilder sb = new StringBuilder();

        for(int i=c; i<=strLen; i+=m){
             String str = Character.toString(my_string.charAt(i-1));
             sb.append(str);
        }
        
        answer = new String(sb);
        return answer;
    }
}