package 프로그래머스.우선탐색;

//프로그래머스 단어변환
public class P43163 {
    static boolean visited[];
    static int answer;

    public static void main(String[] args){
        String begin = "hit";
        String target = "dog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int answer = solution(begin, target, words);
        System.out.println(answer);
    }

    public static int solution(String begin, String target, String[] words) {
        answer = 0;
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int count){
        if(begin.equals(target)){
            answer = count;
        }

        for(int i = 0 ; i < words.length ; i++){
            if(visited[i]){
                continue;
            }

            int spell = 0;
            for(int j = 0 ; j < begin.length() ; j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    spell++;
                }
            }

            if(spell == begin.length() - 1){
                visited[i] = true;
                dfs(words[i], target, words, count+1);
                visited[i] = false;
            }
        }
    }
}
/*
아 좀만 생각하고 풀어볼걸 너도 다음에 다시 풀어본다 이거
 */