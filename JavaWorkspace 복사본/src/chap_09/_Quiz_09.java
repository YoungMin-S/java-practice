package chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //Student st1 = new Student("송영민", "자바");
        //list.add(st1);
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));
        //System.out.println(list.size());

        System.out.println("자바 자격증을 보유한 학생");
        for (Student student : list) {
            if (student.imform.equals("자바")) {
                System.out.println(student.name);

            }
        }
    }
}

class Student {
    public String name;
    public String imform;

    public Student(String name, String imform) {
        this.name = name;
        this.imform = imform;
    }
}

