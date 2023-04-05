package chap_12;

import java.util.TreeMap;

public class _Quiz_12 {
    // 상품 A 와 상품 B 는 각각 5개씩 준비
    // 상품 A 와 상품 B 는 두 사람이 독립적으로 준비
    // 상품 A 와 상품 B 가 모두 준비된 이후 세트 상품 포장 시작
    // 포장이 필요한 세트 상품은 총 5
    public static void main(String[] args) {
        Runnable runnableA = ()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            };
            System.out.println("--A 상품 준비 완료--");
        };
        Thread threadA = new Thread(runnableA);
        Runnable runnableB = ()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            };
            System.out.println("--B 상품 준비 완료--");
        };
        Thread threadB = new Thread(runnableB);



        threadA.start();
        threadB.start();
        //threadB.isAlive() --> true 혹은 false가 나온다
//        while (threadB.isAlive() || threadA.isAlive()) {
//
//        }
        //join과 같은 결과를 가지고 온다.

        try {
            threadB.join();
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = ()->{
            System.out.println("==세트 상품 포장 시작==");
            for (int i = 1; i <=5; i++) {
                System.out.println("세트 상품 준비 " + i + "/5");
            };
            System.out.println("==세트 상품 준비 완료==");
        };
        Thread threadSet = new Thread(runnableSet);

        threadSet.start();






    }
}


