class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String str1 = my_string.substring(0,s);
        String str2 = my_string.substring(s, e+1);
        String str3 = my_string.substring(e+1, my_string.length());
        
        
        StringBuffer sb = new StringBuffer(str2);        
        String str2Re = sb.reverse().toString();            
        
        answer = str1+str2Re+str3;
        return answer;
    }
}