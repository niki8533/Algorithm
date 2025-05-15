package 프로그래머스;

import java.util.*;

//프로그래머스 연속된 부분 수열의 합
public class P178870 {
    public static void main(String[] args){
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int[] answer = solution(sequence, 5);

        System.out.println(answer[0] + " " + answer[1]);
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        //포인터
        int l = 0;
        int r = 0;

        //합계값
        int sum = 0;
        int count = sequence.length;

        for(r = 0 ; r < sequence.length ; r++){
            sum = sum + sequence[r];

            while(r < sequence.length && sum > k) {
                sum = sum - sequence[l];
                l++;
            }

            if(sum == k){
                if(count > r - l){
                    count = r - l;
                    answer[0] = l;
                    answer[1] = r;
                }
            }
        }

        return answer;
    }
}

/*
처음에 이중for문 썼더니 시간초과가 엄청 나서
다른 방법이 있나 찾아보니까 투포인터 알고리즘이 있더라?
이렇게 또 하나 배워갑니다~
 */