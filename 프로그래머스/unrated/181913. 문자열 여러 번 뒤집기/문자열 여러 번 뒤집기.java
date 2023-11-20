class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        // 지정 위치에 문자를 교체하기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int mid = (s+e)/2-s;    // 몇번 돌아야 하는지 계산

            for(int i=0; i<=mid; i++){
                char temp_s = sb.charAt(s+i);
                char temp_e = sb.charAt(e-i);   

               // 지정된 위치의 문자 교체
                sb.setCharAt(s+i, temp_e);
                sb.setCharAt(e-i, temp_s);
                
            }
        }
        
        // StringBuilder to String
        answer=sb.toString();
        return answer;
    }
}