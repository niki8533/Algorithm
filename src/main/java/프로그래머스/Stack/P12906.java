package 프로그래머스.Stack;

import java.util.Stack;

//프로그래머스 같은 숫자는 싫어
public class P12906 {
    public static void main(String[] args){
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer;

        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            if(stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        answer = new int[stack.size()];
        int temp = stack.size() - 1;
        while(!stack.isEmpty()){
            answer[temp--] = stack.pop();
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.print(answer[i]);
        }
    }
}

/*
* 처음 풀때는 큐로 풀었었는데 이번엔 스택으로 풀었다
* 큐로 풀면 마지막에 answer에 값 넣을 때 바로 넣어주면 되고
* 스택으로 풀면 answer에 값 넣을 때 뒤집어서 넣어주면 되고
* 크게 차이는 없는데 사실 저번에 큐로 푼줄 모르고 그냥 스택으로 풀어봤다
* 근데 그렇게 하면 되더라~
*/