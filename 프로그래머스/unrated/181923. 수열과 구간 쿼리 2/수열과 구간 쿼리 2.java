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
            
            // 제한사항의 조건에 의해 가장 작은 수 찾아낼 최대 수 입력
            // [조건] : 0 ≤ arr의 원소 ≤ 1,000,000
            int smallNum = 1000000;
            for(int i : numList){
                if(arr[i]>k){   // k 보다 큰 arr[i]
                    if(arr[i]<smallNum){
                        smallNum = arr[i];
                    }
                }
            }
            
            // 만약 가장 작은 수가 없었다면, -1 입력
            if(smallNum==1000000){
                smallNum = -1;
            }
            
            list.add(smallNum);
        }

        // list to int[] array
        answer =  new int[list.size()];
        for(int idx=0; idx < list.size(); idx++){
           answer[idx]  = (int)list.get(idx);
        }

        return answer;
    }
}