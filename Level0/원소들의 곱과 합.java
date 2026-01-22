class Solution {
    public int solution(int[] num_list) {
        int num = 1;
        int num2 = 0;
        for (int i=0; i<num_list.length; i++){
            num *= num_list[i];
            num2 += num_list[i];
        }
        
        return (num > (num2 * num2) ? 0 : 1);
    }
}
