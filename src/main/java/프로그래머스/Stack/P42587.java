package 프로그래머스.Stack;

import java.util.Collections;
import java.util.PriorityQueue;

//프로그래머스 프로세스
public class P42587 {
    public static void main(String[] args){
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i < priorities.length ; i++){
            pq.offer(priorities[i]);
        }

        outloop:
        while(!pq.isEmpty()){
            for(int i = 0 ; i < priorities.length ; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;

                    if(location == i){
                        break outloop;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}



/*
break outloop에 그냥 return answer을 쓰면 되긴하는데
main이 void형이라서 냅다 return answer을 쓸 수가 없으니 다른 방법을 찾아보는데
라벨을 달면 이중 반복문을 한번에 탈출할 수 있대서 써봤는데
성능도 비슷하고 새로운 방법을 찾았다
근데 실무에서는 잘 안쓰이고 알고리즘 테스트나 이런데서는 쓸 수 있다함
 */