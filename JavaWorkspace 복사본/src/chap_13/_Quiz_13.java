package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오.(주관식)");
        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            String line;
            String correct;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println("(문제)" + line);
                System.out.print("정답 입력 => ");
                correct = br.readLine();
                if (correct.equals(sc.next())) {
                    System.out.println("정답입니다.!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + correct + "입니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("모든 퀴즈가 완료 되었습니다.");
        System.out.println("수고하셨습니다.");
    }
}
