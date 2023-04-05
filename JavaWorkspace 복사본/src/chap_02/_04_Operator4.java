package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean a= true;
        boolean b= true;
        boolean c= true;

        System.out.println(a || b || c ); //이것은 연산자 or 을 나타내는 연산자 이다
        System.out.println(a && b && c ); //이것은 연산자 and 을 나타내는 연산자 이다

        System.out.println((5 > 3) && (3 > 1)); // 5는 3 보다 크고 3은 1 보다 크다
        System.out.println((5 > 3) && (3 < 1)); // 5는 3 보다 크고 3은 1 보다 작다

        //or도 위에와 똑같이 사용하면 된다
        System.out.println((5 > 3) || (3 < 1));
//        System.out.println(1<3<5); 는 불가능 하지만 System.out.println(1<3 %% 3<5)는 가능하다

        //논리 부정 연산자

        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5==5)); //false
        System.out.println(!(5==3)); //true




    }
}
