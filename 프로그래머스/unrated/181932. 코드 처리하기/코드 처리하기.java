class Solution {
    public String solution(String code) {
        
        /*
            char형 비교시 주의
            char형 -> String 변환 주의
        */
        String answer = "";
        String ret = "";
        Boolean mode = false;

        for(int i=0; i<code.length(); i++){
            char chr = code.charAt(i);
            
            if(!mode){
                if(chr != '1'){
                    if(i%2==0) ret+= String.valueOf(chr);
                }else{
                    mode = true;
                }              
                
            }else{
                if(chr != '1'){
                    if(i%2==1) ret+= String.valueOf(chr);
                }else{
                    mode = false;
                }   
            }  
        }
       
 
        answer = (ret.isEmpty())? "EMPTY": ret;
    
        return answer;
    }
}