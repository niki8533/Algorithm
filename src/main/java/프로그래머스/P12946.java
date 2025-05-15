package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 하노이의 탑
public class P12946 {
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args){
        int [][] answer = solution(2);

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i][0] + " " + answer[i][1]);
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = {};

        hanoi(1, 2, 3, n);

        return list.toArray(new int[1][list.size()]);
    }

    public static void hanoi(int start, int mid, int end, int stack){
        if(stack == 1){
            list.add(new int[]{start, end});
            return;
        }

        hanoi(start, end, mid, stack-1);
        list.add(new int[]{start, end});
        hanoi(mid, start, end, stack-1);
    }
}

/*
엣날에 많이 풀었던건데 기억이 안나냐 왜;;
 */