package 프로그래머스.정렬;

import java.util.Arrays;
import java.util.Collections;

//프로그래머스 H-Index
public class P24747 {
    public static void main(String[] args){
        int[] citations = {3, 0, 6, 1, 5};
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i){
                answer = citations.length - i;
                break;
            }
        }

        System.out.println(answer);
    }
}

/*
* h번 이상 인용된 논문이 h편 이상인 최댓값을 구하는거니까
* {0, 1, 3, 5, 6}에서 3일때 인용된 논문 수와 같으니까 정답은 3이 되는거임
* {46, 328, 8344, 164, 1}인 경우에도 {1, 46, 164, 328, 8344}로 정렬하고
* 인용 횟수가 46일때 46번 이상 인용된 논문이 4편 이상인데 46번 인용됐다는건 4회 이상 인용됐다는것이므로
* 정답은 4가 된다
*/