package chap_09.coffee;

public class CoffeByName {
    public Object name;  //Integer, Double, String, BlackBox....

    public CoffeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);

    }
}
