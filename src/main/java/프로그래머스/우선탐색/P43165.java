package 프로그래머스.우선탐색;

//프로그래머스 타겟 넘버
public class P43165 {
    static int answer;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int answer = solution(numbers, target);
        System.out.println(answer);
    }

    public static int solution(int[] numbers, int target) {
        answer = 0;

        dfs(numbers, target, 0, 0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int depth, int sum){
        if(depth == numbers.length){
            if(sum == target){
                answer++;
            }
        } else {
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }


    }
}
