package chap_08.camera;

public abstract class Camera {
    public static void main(String[] args) {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature();  //구현해야 하는 메소드  (자식 클래스에서)


}
