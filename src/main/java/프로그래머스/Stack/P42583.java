package 프로그래머스.Stack;

import java.util.LinkedList;
import java.util.Queue;

//프로그래머스 다리를 지나는 트럭
public class P42583 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();

        int sum = 0;
        for(int i = 0 ; i < truck_weights.length ; i++){
            while(true){
                if(q.isEmpty()){
                    q.offer(truck_weights[i]);
                    sum = sum + truck_weights[i];
                    answer++;
                    break;
                } else if(q.size() == bridge_length){
                    sum = sum - q.poll();
                } else{
                    if(sum + truck_weights[i] <= weight){
                        q.offer(truck_weights[i]);
                        sum = sum + truck_weights[i];
                        answer++;
                        break;
                    }
                    else{
                        q.offer(0);
                        answer++;
                    }
                }
            }
        }

        answer =  answer + bridge_length;
        System.out.println(answer);
    }
}
