package 프로그래머스.정렬;

import java.util.*;

//프로그래머스 K번째 수
public class P42748 {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7 ,3}};
        int[] answer = {};

        answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] arr = new int[end - start];
            int temp = 0;
            for(int j = 0 ; j < arr.length ; j++){
                arr[j] = array[start++];
            }
            Arrays.sort(arr);

            answer[i] = arr[k];
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}

/*
* 아니 왜 배열이 오버되서 나는 에러도 다 non-zero 에러로 나오지?
* 이상하네............
*/