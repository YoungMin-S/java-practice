package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIF

        //한라봉 에이드가 있으면 +1
        //또는 망고 주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean hall = true; //한라봉에이드
        boolean mago = true; //망고 주스
        if (hall){
            System.out.println("한라봉 에이드 +1");
        } else if (mago) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 여러번 사용 가능

        hall = true; //한라봉에이드
        mago = true; //망고 주스
        boolean orange = true; //오렌지 주스
        if (hall){
            System.out.println("한라봉 에이드 +1");
        } else if (mago) {
            System.out.println("망고 주스 +1");
        } else if (orange) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료  #2");

        //else 없이도 가능
        hall = true; //한라봉에이드
        mago = true; //망고 주스
        orange = true; //오렌지 주스
        if (hall){
            System.out.println("한라봉 에이드 +1");
        } else if (mago) {
            System.out.println("망고 주스 +1");
        } else if (orange) {
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료  #3");




    }
}
