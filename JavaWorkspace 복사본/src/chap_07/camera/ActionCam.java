package chap_07.camera;

//Final
public final class ActionCam extends Camera {
    public final String lens; //= "광각렌즈";

    //Constructor
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    //Method
    public final void makeVideo(){
        //this.lens = "값변경"; 불가
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 녹화합니다.");
    }
}
