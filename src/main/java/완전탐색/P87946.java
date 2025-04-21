package 완전탐색;

//프로그래머스 피로도
public class P87946 {
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args){
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};


        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        System.out.println(answer);
    }

    static void dfs(int depth, int piro, int[][] dungeons){
        for(int i = 0 ; i < dungeons.length ; i++){
            if(visited[i] || dungeons[i][0] > piro){
                continue;
            }

            visited[i] = true;
            dfs(depth + 1, piro - dungeons[i][1], dungeons);
            visited[i] = false;
        }

        answer = Math.max(answer, depth);
    }
}
