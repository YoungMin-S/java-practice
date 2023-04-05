package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String a = "일반 차량";
        String b = "경차";
        String c = "장애인 차량";
        int max = 30000;
        int Hmoney = 4000;
        int money;

        for (int i = 0; i<100; i++) {
            if (i == 5 && b == "일반차량") {
                money=i*Hmoney;
                if (money>max)
                    money=max;
                System.out.println("주차 요금은 " + money + "입니다");
                break;
            }

            if (i == 5 && c == "경차") {
                money=i*Hmoney;
                if (money>max) {
                    money = max / 2;
                    System.out.println("주차 요금은 " + money  + "입니다");
                    break;
                }
                System.out.println("주차요금은 "+ money/2 + "입니다");
                break;
            }
            if (i == 10 && c == "장애인 차량") {
                money=i*Hmoney;
                if (money>max) {
                    money = max / 2;
                    System.out.println("주차 요금은 " + money  + "입니다");
                    break;
                }
                System.out.println("주차요금은 "+ money/2 + "입니다");
                break;
            }
        }
// 강의 자료
        int hour = 5;
        boolean isSmallCar = false;
        boolean DisalbedPerson = false;
        int fee = hour *4000;

        if (fee > 30000) {
            fee=30000;
        }
        if (isSmallCar || DisalbedPerson) {
            fee /=2;
        }
        System.out.println("주차 요금은 "+fee + "요금입니다.");
    }
}