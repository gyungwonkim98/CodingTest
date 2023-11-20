class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        
        StringBuffer sb = new StringBuffer();
        int i = 0;  // parts 배열의 방번호 = my_strings 배열의 방번호
        
        for(int[] part : parts){
            int startIndex = part[0];
            int endIndex =   part[1];
            //endIndex + 1 필수!!
            sb.append(my_strings[i].substring(startIndex,endIndex+1));
            i++;
        }
        
        answer = sb.toString();
        return answer;
    }
}