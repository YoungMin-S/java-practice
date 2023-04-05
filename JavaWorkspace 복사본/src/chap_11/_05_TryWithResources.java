package chap_11;

import java.io.BufferedWriter;
import java.nio.Buffer;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("-------------------------");
        //배우는 거 적용 (사용하기 위해서는 AutoCloseable 인터페이스를 구현해야한다.)

        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null;

    }
}

class MyFileWriter implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}
