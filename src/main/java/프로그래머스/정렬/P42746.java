package 프로그래머스.정렬;

import java.util.Arrays;

//프로그래머스 가장 큰 수
public class P42746 {
    public static void main(String[] args){
        int[] numbers = {6, 10, 2};
        String answer = "";

        String[] arr = new String[numbers.length];

        for(int i = 0 ; i < numbers.length ; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr,
                (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(arr[0].equals("0")){
            answer = "0";
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer = answer + arr[i];
            }
        }

        System.out.println(answer);
    }
}

/*
* 그냥 숫자로 비교하기에는 10의 자리, 100의 자리 수가 크다고 나오니까
* 문자열로 조합했을 때 큰 수를 비교하는게 맞음
* compareTo 쓰면 두 문자열을 붙여 봤을 때 어떤 순서가 더 큰 수를 만드는가를 기준으로 비교하니까
* (o2 + o1).compareTo(o1 + o2)는 o2 + o1이 더 크면 양수를 반환해서
* o1 앞에 o2가 배치됨
*/