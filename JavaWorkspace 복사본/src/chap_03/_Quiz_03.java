package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String Num = "901231-1234567"; //주민번호
        //생년월일 까지만 출력
        System.out.println(Num.substring(0,Num.indexOf("-")+2));
        Num = "030708-4567890";
        System.out.println(Num.substring(0,Num.indexOf("-")+2));

    }
}
