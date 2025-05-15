package 프로그래머스.완전탐색;

import java.util.HashSet;
import java.util.Set;

//프로그래머스 소수 찾기
public class P42839 {
    static boolean[] visited;
    static Set<Integer> set;

    public static void main(String[] args){
        String numbers = "17";
        int answer = 0;

        visited = new boolean[numbers.length()];
        set = new HashSet<>();

        dfs(numbers, 0, "");

        for(int temp : set){
            if(isPrime(temp)){
                answer++;
            }
        }

        System.out.println(answer);
    }

    static void dfs(String numbers, int depth, String s){
        if(depth > numbers.length()){
            return;
        }

        for(int i = 0 ; i < numbers.length() ; i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, depth+1, s + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }

    static boolean isPrime(int temp){
        if(temp < 2){
          return false;
        }

        for(int i = 2 ; i <= (int)Math.sqrt(temp) ; i++){
            if(temp % i == 0){
                return false;
            }
        }

        return true;
    }
}
