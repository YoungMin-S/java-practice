package chap_07.camera;

//SpeedCam is a Camera.(Is a관계)
public class SpeedCam extends Camera { //자식 클래스
    //생성자
    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture(){
        //사진촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    //메소드
    public void checkSpeed(){
        //속도체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override //annotation
    public void showMainFeature(){
        System.out.println(this.name + " 의 주요 기능 : 속도체크, 차량번호 인식");
    }
}
