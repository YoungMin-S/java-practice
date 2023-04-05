package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and",",")); // and 를 ,로 전환
        System.out.println(s.substring(7)); //index 기준 7부터 시작 ( 이전 내용은 삭제) s 변수에는 반영되지 않음

        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //시작위치 부터 끝 위치 직전까지 출력

        //공백 제거
        s = "        I love Java.     ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결함
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1+ "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
