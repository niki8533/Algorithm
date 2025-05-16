package 프로그래머스.완전탐색;

//프로그래머스 전력망을 둘로 나누기
import java.util.*;

public class P86971 {
    public static boolean[] visited;
    public static int answer;
    public static ArrayList<Integer>[] graph;

    public static void main(String[] args){
        int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        solution(n, wires);

        System.out.println(answer);
    }

    public static int solution(int n, int[][] wires) {
        answer = Integer.MAX_VALUE;
        graph = new ArrayList[n + 1];

        for(int i = 1 ; i <= n ; i++){
            graph[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for(int i = 0 ; i < wires.length ; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];

            visited = new boolean[n+1];

            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));

            int cnt = dfs(1, visited);

            int diff = Math.abs(cnt - (n - cnt));
            answer = Math.min(diff, answer);

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        return answer;
    }

    static int dfs(int v, boolean[] visited){
        visited[v] = true;
        int cnt = 1;

        for(int next: graph[v]){
            if(!visited[next]){
                cnt = cnt + dfs(next, visited);
            }
        }

        return cnt;
    }
}
