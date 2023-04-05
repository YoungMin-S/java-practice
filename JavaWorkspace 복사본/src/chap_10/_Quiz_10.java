package chap_10;

//입장료는 1인당 5000원으로 고정
//20세 이상의 손님들에게만 입장료 부과 (그 외에는 무료)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        Stream<Customer> stream = list.stream();

        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

//        List<String> collect = list.stream()
//                .map(x -> (x.age >= 20) ? x.name + " 5000원" : x.name + " 무료")
//                .collect(Collectors.toList());
        System.out.println("미술관 입장료");
        System.out.println("-----------------------");
        list.stream()
                .map(x -> (x.age >= 20) ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);
//        for (String c :
//                collect) {
//            System.out.println(c);
//        }
    }
}

class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
