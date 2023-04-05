package chap_07;

import chap_07.camera.Camera;

import java.util.concurrent.Callable;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 : int,float, double, long , boolean .... (메소드를 가지지 않는다.) 소문자 시작

        int[] i = new int[3];
        System.out.println(i[0]); //0

        double[] d = new double[3];
        System.out.println(d[0]); //0.0

        // 참조 자료형 : String, Camera, FactoryCam, SpeedCam, .....  (메소드를 가질 수 있다.) 대문자 시작
        String[] s = new String[3];
        System.out.println(s[0]); //null

        Camera[] c = new Camera[3];
        System.out.println(c[0]); // null

        //////////////
        System.out.println("------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("----------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null; //잡고 있던 풍선을 놓는다고 생각하면 된다.
        System.out.println(c2.name);

    }

    // 참조
    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
