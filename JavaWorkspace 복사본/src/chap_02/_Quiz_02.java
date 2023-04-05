package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;

        String s = (a>=120)  ? "키가 " + a + "cm 이므로 탑승 가능 합니다." :"키가 " + a + "cm 이므로 탑승 불가능 합니다.";
        System.out.println(s);

        a= 121;
        String b = (a>=120)  ? "키가 " + a + "cm 이므로 탑승 가능 합니다." :"키가 " + a + "cm 이므로 탑승 불가능 합니다.";
        System.out.println(b);
    }
}
