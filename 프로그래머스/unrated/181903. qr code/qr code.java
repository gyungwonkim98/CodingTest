class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<code.length(); i++){
            if(i%q==r){
				String str = Character.toString(code.charAt(i));
                sb.append(str);
            }
        }
        
        answer = new String(sb);
        return answer;
    }
}