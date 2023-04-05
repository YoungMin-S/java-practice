package chap_07;

public class _05_MethodOverloding {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        System.out.println("-------------------");
        b1.record(true, true, 3);
        System.out.println("--------------------");
        b1.record(true, true, 5);

        System.out.println("------------------");
        //메소드 오버로딩
        b1.record();


        //String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));

    }
}
