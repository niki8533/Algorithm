package 프로그래머스.완전탐색;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 카펫
public class P42842 {
    public static void main(String[] args){
        int brown = 10;
        int yellow = 2;
        int[] answer;

        List<Integer> list = new ArrayList<>();
        int total = brown + yellow;

        for(int i = 1 ; i <= total ; i++){
            if(total % i == 0){
                list.add(i);
            }
        }

        int w = 0;
        int h = 0;

        if(list.size() % 2 == 0){
            for(int i = 0 ; i < list.size() / 2 ; i++){
                w = list.get(i);
                h = list.get(list.size() - i - 1);

                if((w-2)*(h-2) == yellow)
                    break;
            }
        } else{
            h = w = list.get(list.size()/2);
        }

        answer = new int[2];
        answer[0] = w;
        answer[1] = h;

        System.out.println(answer[0] + " " + answer[1]);

    }
}
