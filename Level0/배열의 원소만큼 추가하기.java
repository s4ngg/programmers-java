import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> ai = new ArrayList<>();
        
        for (int num : arr){
           for (int i=0; i<num; i++){
               ai.add(num);
           }
        }
        int[] answer = new int [ai.size()]; // .size() = ArrayList에서  크기를 받아오는 메서드
        for (int i=0; i<ai.size(); i++){
            answer[i] = ai.get(i); // .get() = ArrayList에서 값을 받아오는 메서드
        }
        
        return answer;
    }
}
