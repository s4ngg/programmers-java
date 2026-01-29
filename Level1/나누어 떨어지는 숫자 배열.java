import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0){
                answer.add(i);
            }
        }
        Collections.sort(answer); //#1 Arrays.sort(answer);을 사용했으나 ArrayList는 배열이 아니라 컬렉션을 사용해야함.
        if (answer.isEmpty()) { // .isEmpty()로 비어있는지 확인.
            return new int[]{-1};
        }    // #2 처음에 여기서 끝냈으나 answer을 ArrayList[]를 int[]로 바꾸지 않아서 오류 발생
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
        // answer.stream() -> answer을 스트림으로 변환
        // mapToInt(Integer::intValue) -> Integer을 intValue로 변환
        // 앞에서 변환한 intValue를 .toArray()로 변환
    }
}
