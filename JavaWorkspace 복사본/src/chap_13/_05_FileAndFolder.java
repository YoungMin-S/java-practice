package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "."; //"."은 현재 위치경로를 나타냄 여기서는 JavaWorkspace를 나타냄 (상대경로)
        //String folder ="/Users/song-yeongmin/Desktop/java/JavaWorkspace/src/chap_13"; //절대경로
        String folder ="src/chap_test줌"; //상대경로
        File fileAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + fileAndFolders.getAbsolutePath());
        for (File file : fileAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
