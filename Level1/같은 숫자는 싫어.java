import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]); // 첫번째 요소는 비교대상이 없음으로 1개 추가해서 비교
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()]; // list에서 int[]배열로 변환
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }   
        
        
        return answer;
    }
}
