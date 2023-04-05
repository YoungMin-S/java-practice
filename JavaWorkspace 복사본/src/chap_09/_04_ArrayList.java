package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 : 배열을 선언해서 고정된 크기만큼 넣는 것이 아닌 자신이 원하는 만큼 집어넣고 삭제,탐색,정렬 등등을 하는 기능을 제공함
        // List,Set,Map

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------------");

        // 데이터 삭제 (박명수)
        System.out.println("신청 학생 수 (삭제 전) :" + list.size()); //5
        list.remove(3); //list.remove("박명수") 와 같은말이다.
        System.out.println("신청 학생 수 (삭제 후) :" + list.size()); //4
        System.out.println(list.get(3));

        System.out.println("--------------------");

        System.out.println("남은 학생 수 (제외 전)" + list.size()); //4
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후)" + list.size()); //3

        System.out.println("--------------------");

        //순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        //변경 (양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("--------------------");

        //확인 (자신의 위치 확인)
        System.out.println(list.indexOf("김종국"));
        // 포함되어 있는 지 확인
        if (list.contains("김종국")) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        System.out.println("--------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println(list.size());
            System.out.println("리스트가 비어있습니다.");
        }

        System.out.println("--------------------");

        // 다음 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 정렬
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
