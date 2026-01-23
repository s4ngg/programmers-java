class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length+1];
        int num1 = num_list.length-1;
        int num2 = num_list.length-2;
        
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if (answer[num1] > answer[num2]) {
            answer [num_list.length] = answer[num1] - answer[num2];
        } else {
            answer [num_list.length] = answer [num1] * 2;
        }
        return answer;
    }
}
