package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형 (Enum)
        //달력
        //옷사이즈
        //os 종류
        //해상도

        //사용법
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }


        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);


        System.out.println("-------------------");
        //values() 는 값을 꺼내는 name()은 쓰나 안쓰나 같고 ordinal은 순서를 보여줌
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name()+ " : "+ myRes.ordinal());
        }


        System.out.println("------------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1280),FHD(1920),UHD(3840);

    private final int width;

    //생성자
    Resolution(int width) {
        this.width = width;
    }

    //getter
    public int getWidth(){
        return width;
    }

}
