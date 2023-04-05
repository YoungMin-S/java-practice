package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //캡슐화
        //정보은닉

        //전급 제어자
        // 1. private : 해당 클래스 내에서만 접근 가능
        // 2. public : 모든 클래스에서 전급 가능
        // 3. default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 전급 가능
        // 4. protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 전급 가능

        //getter와setter 에도 전급제어자를 사용이 가능 하고 class 에도 전급 제어자를 사용할 수 있다.

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "까망";

        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        //고객 문의
        System.out.println(b1.resolution);

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("하양");

        System.out.println("가격" + b2.getPrice());
        System.out.println("해상도 " + b2.getResolution());


    }
}


