package 프로그래머스;

import java.util.Arrays;
import java.util.Locale;

//카카오 2018 블라인드 채용 파일명 정렬
public class P17686 {
    public static void main(String[] args){
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] answer = {};
        answer = solution(files);

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] name = new String[files.length][3];

        for(int i = 0 ; i < files.length ; i++){
            String s = files[i];

            int start = 0;
            boolean first = true;
            int end = 0;
            int size = 0;

            for(int j = 0 ; j < s.length() ; j++){
                if(Character.isDigit(s.charAt(j))){
                    if(first){
                        start = j;
                        first = false;
                    }
                    size++;
                }
                else{
                    if(!first){
                        break;
                    }
                }
            }

            end = start + size - 1;

            String head = s.substring(0, start);
            String num = s.substring(start, end+1);
            String tail = s.substring(end+1);

            name[i][0] = head;
            name[i][1] = num;
            name[i][2] = tail;
        }

        Arrays.sort(name, (o1, o2) -> {
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) > 0){
                return 1;
            } else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) < 0){
                return -1;
            } else {
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])){
                    return 1;
                } else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])) {
                    return -1;
                } else return 0;
            }
        });

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = name[i][0] + name[i][1] + name[i][2];
        }

        return answer;
    }
}

/*
파트별로 쪼개서 따로 저장한다음 비교하면 된다고 알려줬는데
왜 그걸 써먹지를 못하니 왜.....
 */