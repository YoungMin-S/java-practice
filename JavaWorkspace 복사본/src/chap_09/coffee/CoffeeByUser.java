package chap_09.coffee;

import chap_09.user.User;
//반드시 user 클래스를 상속하는 T를 사용해야한다.
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
