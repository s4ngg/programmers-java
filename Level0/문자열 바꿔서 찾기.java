class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for (int i=0; i<myString.length();i++){
            char c = myString.charAt(i);
            if (c == 'A') {
                answer += 'B';
            }
            else {
                answer += 'A';
            }
        }
        if (answer.contains(pat)){
            return 1;
        }
        return 0;
    }
}
// StringBuilder 이용해서 풀기
StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'A') {
                answer.append('B');
            } else {
                answer.append('A');
            }
        }

        if (answer.toString().contains(pat)) {
            return 1;
        }
        return 0;
