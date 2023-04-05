package chap_07.camera;

public class SlowActionCam {//extends ActionCam {
    public String name;
    public SlowActionCam(){
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println("자체 개발한 비디오 제작 기능");
    }

//    public void makeVideo(){
//        //this.lens = "값변경"; 불가
//        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 녹화합니다.");
//    }
}
