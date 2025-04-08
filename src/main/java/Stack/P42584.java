package Stack;

import java.util.Stack;

//프로그래머스 주식가격
public class P42584 {
    public static void main(String[] args){
        int[] prices = {3, 5, 2, 6, 7, 8, 1, 10, 9};
        int[] answer = {};

        answer = new int[prices.length];
        for(int i = 0 ; i < prices.length - 1 ; i++){
            Stack<Integer> stack = new Stack<>();
            for(int j = i+1 ; j < prices.length ; j++){
                stack.add(prices[j]);
                if(prices[i]> prices[j]){
                    break;
                }
            }
            answer[i] = stack.size();
        }

        answer[prices.length - 1] = 0;

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}

/*
* 이거는 스택 안쓰는게 효울성에서 좋은데
* 스택/큐 문제여서 스택을 써봤다
* 방법이 되게 여러가지라서
* 다른 방법으로도 나중에 풀어봐야겠다
*/