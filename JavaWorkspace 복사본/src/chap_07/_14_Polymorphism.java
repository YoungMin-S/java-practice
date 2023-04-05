package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //다형성

        //class person : 사람
        //class Student extends Person : 학생 (학생은 사람이다.Student is a person)
        //class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factorycam = new FactoryCam();
        Camera speedcam = new SpeedCam();

        camera.showMainFeature();
        factorycam.showMainFeature();
        speedcam.showMainFeature();

        System.out.println("-----------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------------");

       //camera 라는 부모클래스로 정의 해서 사용 불가하다
//        factorycam.detectFire();
//        speedcam.checkSpeed();
//        speedcam.recognizeLicensePlate();

        if (camera instanceof  Camera){
            System.out.println("카메라 입니다");
        }
        if (factorycam instanceof FactoryCam) {
            //공장카메라 클래스 에서 나오는 클래스를 사용하려면 자료형 변환과 유사하게 적는다.
             ((FactoryCam) factorycam).detectFire();
        }

        if (speedcam instanceof SpeedCam) {
            ((SpeedCam) speedcam).checkSpeed();
            ((SpeedCam) speedcam).recognizeLicensePlate();
        }


        //Object라는 클래스를 상속하고 있다
//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new SpeedCam();
//        objs[2] = new FactoryCam();

    }
}
