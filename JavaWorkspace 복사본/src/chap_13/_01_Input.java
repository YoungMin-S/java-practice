package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next(); //String 형태로 받음
//
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//
//        System.out.println("키를 입력하세요");
////        int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();
//
//        System.out.println("몸무게를 입력하세요");
////        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); //한 단어
        //String lang = sc.nextLine();
        System.out.println("언어 : " + lang);

        sc.nextLine(); //불필요한 문장을 삭제 -> 즉 한 단어 이상의 입력을 했을 때 다음 글자들을 삭제한다.

        System.out.println("배우고 나니 기분이 어땟나요?");
        //String feeling = sc.next(); //한 문장 (재밌었어요)
        String feeling = sc.nextLine(); // next() 메소드는 (한 단어)띄어쓰기를 기준으로 나뉘어 지지만 nextLine()메소드는 입력을 기준으로 나뉜다.

        System.out.println("기분 : " + feeling);


    }
}
