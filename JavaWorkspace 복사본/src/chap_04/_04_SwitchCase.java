package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case

        //석차에 따른 장학금 지급
        //1등 :전액 장학금
        //2등 :반액 장학금
        //3등 :반액 장학금
        //그 외 :장학금 대상 아님


        //여러조건 또는 범위 사용시 이용
        int ranking = 1; // 1등
        if (ranking==1){
            System.out.println("전액 장학금");
        } else if (ranking==2 || ranking==3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 #1");

        //Switch Case 문 이용 (명확한 케이스가 있는 경우)
        ranking =1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 #2");
        // case 2 와 case 3 을 통합
        ranking =1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 #2");

        //중고상품의 등급에 따른 가격을 책정(1급 : 최상 ,4 급 : 최하)
        int grade = 1;//등급
        int price = 7000; //기본 가격
        // 브레이크를 적절히 사용해서 책정 가격을 점점 높게 설정할 수 있다.
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + " 등급 제품의 가격 : " + price +"원");
        //1등급 : 10000원
        //2등급 : 9000원






    }
}
