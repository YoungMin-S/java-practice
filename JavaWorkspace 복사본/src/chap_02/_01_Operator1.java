package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산

        System.out.println(4 + 2); //6
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); //2
        System.out.println(2 / 4); //0
        System.out.println(4 % 2); //0 나머지 연산자
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  //우리가 아는 그 연산 순서를 가진다

        //변수를 이용한 연산

        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;

        System.out.println(c);

        //증감 연산 ++, --
        int val = 10;
        System.out.println(val); //10
//        val++; //문장을 실행하고 1을 더한다.
//        ++val; //먼저 1을 더하고 문자를 실행한다.
        // "--"를 사용하는 것도 위에 것과 동일하게 이용된다

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); //대기인원 0
        System.out.println("대기 인원 : " + waiting++); //대기인원 1
        System.out.println("대기 인원 : " + waiting++); //대기인원 2
        System.out.println("총 대기 인원 : " + waiting); //대기인원 3



    }
}
