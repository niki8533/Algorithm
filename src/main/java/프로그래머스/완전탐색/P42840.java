package 프로그래머스.완전탐색;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 모의고사
public class P42840 {
    public static void main(String[] args){
        int[] answers = {1, 3, 2, 4, 2};
        int[] answer = {};

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] correct = new int[3];

        for(int i = 0 ; i < answers.length ; i++){
            if(p1[i%5] == answers[i]){
                correct[0]++;
            }
            if(p2[i%8] == answers[i]){
                correct[1]++;
            }
            if(p3[i%10] == answers[i]){
                correct[2]++;
            }
        }

        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){
            if(correct[i] == max){
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        int temp = 0;
        for(int p : list){
            answer[temp++] = p;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}
