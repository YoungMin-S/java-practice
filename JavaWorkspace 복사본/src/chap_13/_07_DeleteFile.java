package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }



        if (deleteFolder(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
        }





    }

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) { //listFiles() 메소드는 해당경로 안에 있는 파일이나 폴더를 리스트화 함.
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
