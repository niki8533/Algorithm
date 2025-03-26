package Hash;

import java.util.*;

//프로그래머스 완주하지 못한 선수
public class P42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";

        //처음에 list로 해당 문제를 풀었었는데
        //시간이 오버가 되면서 hashMap으로 문제를 풀었다
        //다른 방법이 있나 찾아보고 싶은데..
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < participant.length ; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for(int i = 0 ; i < completion.length ; i++){
            map.put(completion[i], map.getOrDefault(completion[i], 0) + 1);
        }

        for(String name: participant){
            if(map.get(name) % 2 != 0){
                answer = name;
                break;
            }
        }

        System.out.println(answer);
    }
}
