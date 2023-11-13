class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
    
        for(int[] room : queries){
            int a = room[0];
            int b = room[1];
                
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        
        answer = arr.clone();
        return answer;
    }
}