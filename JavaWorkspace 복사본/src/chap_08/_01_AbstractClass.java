package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class  _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화( Data Abstraction)
        //abstract
        //추상 클래스 (아직 완성 되지 않은 클래스)
        // 추상 메소드 (추상 클래스 떠는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드


        //Camera camera = new Camera(); (추상클래스를 상속한 자식 클래스는 객체를 만드는 것이 가능하다..)
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();


    }
}
