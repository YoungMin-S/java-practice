package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("-----------------------");

        Coffee c2 = new Coffee();
        c1.order("라떼");
        System.out.println("-----------------------");

        // 익명 클래스 사용

        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스에요");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
        //Coffee c4 = getCoffee();




    }
    //2번째에서 사용하는 것을 모방해서 해봤는데 return 에 사용이 가능한 것은 커피 클래스로 만든 객체이외에는 사용이 불가능하다 int,String 등등
//    public static Coffee getCoffee(){
//        return new Coffee().order("아메리카노");
//    }

}
class Coffee{
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
//        return null;
    }
    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다,.");
    }
}