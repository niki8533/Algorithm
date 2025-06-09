package 프로그래머스.우선탐색;

import java.util.LinkedList;
import java.util.Queue;

//프로그래머스 게임 맵 최단거리
public class P1844 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] visited;

    public static void main(String[] args){
        int[][] maps = {{1, 0, 1, 1, 1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        int answer = solution(maps);
        System.out.println(answer);
    }

    public static int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        bfs(maps);

        answer = visited[maps.length - 1][maps[0].length - 1];
        if (answer == 0){
            answer = -1;
        }

        return answer;
    }

    static void bfs(int[][] maps){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while(!q.isEmpty()){
            int[] current = q.remove();
            int cx = current[0];
            int cy = current[1];

            for(int i = 0 ; i < 4 ; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length &&  visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    visited[nx][ny] = visited[cx][cy] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}

/*
왜 최단거리는 맨날 풀어도 풀어도 모르겠지? 아오
 */
