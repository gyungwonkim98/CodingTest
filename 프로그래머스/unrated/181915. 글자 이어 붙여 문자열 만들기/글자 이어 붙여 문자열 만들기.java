class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        //String에 문자를 계속 추가하면 메모리 이슈가 있기에 StringBuffer 사용
        StringBuffer ans = new StringBuffer();
    
        for(int index : index_list){
            ans.append(my_string.charAt(index));
        }
        
        answer=ans.toString();
        return answer;
    }
}