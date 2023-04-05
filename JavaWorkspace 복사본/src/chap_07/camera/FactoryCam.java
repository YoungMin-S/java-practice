package chap_07.camera;

//FactoryCam is a Camera(Is a관계)

import javax.xml.namespace.QName;

public class FactoryCam  extends  Camera{ //자식 클래스

    public FactoryCam() {
        //this.name = "공장카메라";
        super("공장 카메라");
    }
    public void recordVideo(){
        //동영상
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        //화재감지
        System.out.println("화재 감지합니다.");
    }
    //메소드 오버로딩
    public void showMainFeature(){
        System.out.println(this.name + " 의 주요 기능 : 화재 감지");
    }
}

