package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; //가격
    String color; //색상
    int serialNumber; //시리얼 번호
    // --------------인스턴스 변수-----------------------

    static  int counter = 0; // 시리얼 번호를 생성해 주는 역활 ( 처음에는 0 이였다가 ++ 연산을 통해서 값을 증가)

    static boolean canAutoReport = false; //자동 신고 기능 (클래스 변수)

    //생성자 생성
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. "+ this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }



    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }


    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입 되었습니다.");
        System.out.println("용량은" + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9;
        } else if (type == 2) { //이벤트 영상
            return 1;
        }
        return 10;
    }

    //showDateTime : 날짜 정보 표시 여부
    //showSpeed : 속도정보 표시 여부
    //min : 영상 기록 단위 (분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다");
        }
        System.out.println("영상은" + min + " 분 단위 로 기록됩니다.");
    }

    //메소드 오버로딩 : 새롭게 메소드를 호출할 때 안에 다르게 작성하면 수정하기 힘드니 메소드 안에 메소드를 넣어서 만든다. 한마디로 기본값을 만든다는 느낌
    void record(){
        record(true, true, 5);
    }

    static void callServiceCenter(){ //클래스 메소드
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");
        //modelName = "test";
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    //Getter (값을 가지고 오는 메소드) & Setter (값을 설정하는 메소드)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution(){
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }




}

