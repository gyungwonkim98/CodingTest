import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        // 정답 저장할 리스트 생성
        ArrayList list = new ArrayList();
       
        // 이차원배열 queries 반복문 돌며, 원소 접근
        for(int idx=0; idx< queries.length; idx++){
            int s = queries[idx][0]; //0
            int e = queries[idx][1]; //4
            int k = queries[idx][2]; //2
            
            // s와 e 사이의 수 - 리스트 저장
            ArrayList<Integer> numList = new ArrayList<Integer>();
       
            for(int i=s; i<=e; i++)
                numList.add(i);
            
           //i가 k의 배수일때, 수 변경
            for(int i : numList){
                if(i%k==0){   
                    arr[i]+=1;
                }
            }
            
        }

        // answer에 arr 복사
        answer= arr.clone();
        return answer ;
    }
}