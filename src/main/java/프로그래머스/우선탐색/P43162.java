package 프로그래머스.우선탐색;

//프로그래머스 네트워크
public class P43162 {
    static boolean visited[];
    public static void main(String[]args){
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int answer = solution(n, computers);

        System.out.println(answer);
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, computers, n);
            }
        }
        return answer;
    }

    public static void dfs(int depth, int[][] computers, int n){
        visited[depth] = true;

        for(int i = 0 ; i < n ; i++){
            if(!visited[i] && computers[depth][i] == 1){
                dfs(i, computers, n);
            }
        }
    }
}

/*
DFS 기본문제 인거같은데 종종 자주 풀어봐야겠다.,..
*/