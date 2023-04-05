package chap_03;

public class _03_Stringcompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true,다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        //문자열 비교 심화

        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1==s2); //true (참조)

        s1 = new String("1234");  //내용은 같지만 서로 다른 메모리 공간에 존재하기 때문에 2번째와 같이 하면 false가 나오게 된다.
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //ture
        System.out.println(s1 == s2); //false
    }
}
