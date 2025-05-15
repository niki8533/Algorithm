package 프로그래머스.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//프로그래머스 기능 개발
public class P42586 {
    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {};

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < speeds.length ; i++){
            double remain = (100 - progresses[i]) / (double)speeds[i];
            int day = (int)Math.ceil(remain);

            if(!q.isEmpty() && q.peek() < day){
                ans.add(q.size());
                q.clear();
            }

            q.offer(day);
        }

        ans.add(q.size());

        answer = new int[ans.size()];

        int index = 0;
        for(int answers: ans){
            answer[index++] = answers;
        }
    }
}

/*
* 처음에 제출했던 방법이 복잡도가 200%가 나와서
* 다른 방법이 있나 찾아보는데 날짜를 미리 계산해서 푸는 방식이 있었네
* 이렇게 푸니까 복잡도 많이 안높고 좋은 방법인듯?
*/
