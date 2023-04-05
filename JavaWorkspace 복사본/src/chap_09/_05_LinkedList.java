package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드리스트
        //ArrayList는 옆으로 옮기면서 하는 반면 LinkedList는 그 사이에 놓을 수 있다.
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------------");
        
        //LinkedList의 추가 Arraylist와 다른점
        list.addFirst("서장훈");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");
        list.addLast("김희철");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        //둘다 가능한 기능
        System.out.println("사람 추가 전 (index 1) " + list.get(1));
        list.add(1, "김영철");
        System.out.println("인원 추가 후 (index 1) " + list.get(1));
        System.out.println("인원 추가 후 (index 2) " + list.get(2));

        System.out.println("----------------------");

        //삭제
        System.out.println("남은 인원 (제외 전) " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 인원 (제외 후) " + list.size());

        System.out.println("----------------------");

        //처음과 마지막 삭제
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("남은 인원 (제외 전) " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 인원 (제외 후) " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        //변경
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("존재");
        } else {
            System.out.println("없음");
        }

        System.out.println("----------------------");

        // 리스트 전체 삭제

        list.clear();
        if (list.isEmpty()) {
            System.out.println("인원 수 " + list.size());
            System.out.println("인원이 없습니다.");
        }

        System.out.println("----------------------");


        //새로운 배열
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list); //정렬
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");



    }
}
