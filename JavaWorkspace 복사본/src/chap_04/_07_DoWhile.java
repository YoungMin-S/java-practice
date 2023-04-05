package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile

        int distance = 25; //전체 이동거리
        int move = 0;   //현재 이동거리
        int height = 2;  //키가 2m

        while (move + height < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 :" + move);
            move += 3;
        }
        System.out.println("도착 했습니다.");

        System.out.println("------반복문 #1 --------");
        // 키가 너무 큰 사람?
        move = 0;
        height = 25;

        while (move + height < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 :" + move);
            move += 3;
        }
        System.out.println("도착 했습니다.");

        System.out.println("------반복문 #2 --------");

        //Do while 반복문 (do에 있는 부분은 무조건 수행하고 while문의 조건을 확인한다)
        do {
            System.out.println("발차기르 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착 했습니다.");



    }
}
