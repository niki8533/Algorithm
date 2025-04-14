package 완전탐색;

import java.util.Arrays;

//프로그래머스 최소직사각형
public class P86491 {
    public static void main(String[] args){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = 0;

        int w = 0;
        int h = 0;

        for(int i = 0 ; i < sizes.length ; i++){
            Arrays.sort(sizes[i]);
        }

        for(int i = 0 ; i < sizes.length ; i++){
            if(w < sizes[i][0]){
                w = sizes[i][0];
            }
            if(h < sizes[i][1]){
                h = sizes[i][1];
            }
        }

        answer = w * h;

        System.out.println(answer);
    }
}
