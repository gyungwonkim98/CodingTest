import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        // ASCII 코드값에는 십진수(Dec.)기준으로 
        //-- 숫자(0~9)가 48번~57번
        //-- 알파벳 대문자(A~Z)는 65번~90번
        //-- 알파벳 소문자(a~z)는 97번~122번
        //-- 중간 7개 문자 체크 삭제
        
        
        // 문자 --> 아스키 코드
        char a = 'A';
        char z = 'z';
        
        for(int i=(int)a; i<=(int)z; i++){
        
            if(i>90 && i<97){
                continue;
            }
            
            char ch = (char)i;
            int arrLen = answer.length;
            
            int count = 0;     
            if(my_string.contains(Character.toString(ch))){       
                for (int j = 0; j < my_string.length(); j++) {            
                    if (my_string.charAt(j) == ch) {               
                        count++;           
                    }        
                }         
            }
            intArr.add(count);
        }

       // ArrayList to int[]
       answer= new int[intArr.size()];
       for (int i = 0 ; i < intArr.size() ; i++) 
            answer[i] = intArr.get(i).intValue();
    
        return answer;
    }
}