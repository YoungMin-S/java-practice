package chap_12.clean;
//쓰레드 사용
public class CleanThread extends Thread {
    public void run(){
        System.out.println("-- 직원 청소 시작 (Thread)--");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("-- 직원 청소 끝 (Thread)--");
    }
}
