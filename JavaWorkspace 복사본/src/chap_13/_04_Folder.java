package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("----------------------------");

        folderName = "A/B/C";
//        "A" + File.separator + "B" + File.separator + "C"; 이런식으로 저장하면 운영체제에 맞는 슬래시를 넣는다
        //맥 : /User/song/Desktop/.... 형식으로 적으면 된다.
        folder = new File(folderName);
        //folder.mkdir(); //단일 폴더 하나만 생설 할 때 사용,단일 폴더를 생성하는데 그 안에 부모 폴더가 있을 때 사용한다
        folder.mkdirs(); //하위 폴더 여러 개를 만들때 사용
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
