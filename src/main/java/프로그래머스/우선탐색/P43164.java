package 프로그래머스.우선탐색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//프로그래머스 여행경로
public class P43164 {
    static boolean[] visited;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args){
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] answer = solution(tickets);

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        visited = new boolean[tickets.length];

        dfs(0, "ICN", "ICN", tickets);

        Collections.sort(list);

        answer = list.get(0).split(",");
        return answer;
    }

    public static void dfs(int depth, String start, String departure, String[][] tickets){
        if(depth == tickets.length){
            list.add(departure);
            return;
        }

        for(int i = 0 ; i < tickets.length ; i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                dfs(depth + 1, tickets[i][1], departure + "," + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }
}

/*
list에 넣고 정렬돌리면 알파벳 순서대로 정렬되니까
가장 위에꺼 하나 빼서 배열로 변환하면 되는거였다
제발 생각을 해 생각 왜 우리는 좌뇌, 우뇌, 전두엽이 다 있는데
왜 생각을 못하는걸까?
 */