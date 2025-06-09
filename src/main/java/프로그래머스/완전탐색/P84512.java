package 프로그래머스.완전탐색;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 모음사전
public class P84512 {
    static List<String> list;
    static String[] dict = {"A", "E", "I", "O", "U"};

    public static void main(String[] args){
        int answer = solution("AAAE");
        System.out.println(answer);
    }

    public static int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();

        dfs("", 0);

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void dfs(String word, int depth){
        list.add(word);
        if(depth == 5){
            return;
        }

        for(int i = 0 ; i < 5 ; i++){
            dfs(word + dict[i], depth + 1);
        }
    }
}

/*
for문 두번 써서 대충 다 돌려보면 나오겠지? 했는데
사전 진행방식이 내 생각이랑 좀 달라서
list에 나올 수 있는 단어 전부 다 넣어놓고 비교하는 방식을 써야했음
단어도 dfs로 만들어서 넣어야하는 방식이었음 후..
*/