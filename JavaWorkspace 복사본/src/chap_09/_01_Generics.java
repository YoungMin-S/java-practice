package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제너릭스 : 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메소드를 정의하는 방법 Wrapper 클래스를 사용해야한다
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};  //이건 Wrapper가 아님

        printintArray(iArray);
        pritndoubleArray(dArray);
        printstringArray(sArray);

        System.out.println("---------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printstringArray(sArray);
    }

    private static void printstringArray(String[] sArray) {
        for (String i :
                sArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // T : Type
    // K : Key , E : Elenment
    private static <T> void printAnyArray(T[] Array){
        for (T i :
                Array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void pritndoubleArray(Double[] dArray) {
        for (double i :
                dArray) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void printintArray(Integer[] iArray) {
        for (int i :
                iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
