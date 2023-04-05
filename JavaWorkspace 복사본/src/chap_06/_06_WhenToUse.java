package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
        return getPower(number, 2);
    }
    public static  int getPower(int number, int exponet){
        int result =1;
        for (int i = 0; i < exponet; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(getPower(2,2));


        //3의 3승을 구하기
        System.out.println(getPower(3,3));

        //4의 4승을 구하기
        System.out.println(getPower(4,4));



    }
}


