package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int error=2;
        try {
            if (error == 0) {
                System.out.println("(상품구매를 완료하였습니다.)");
            } else if (error == 1) {
                throw new PossibleTime("상품 구매 가능 시간이 아닙니다.");
            } else {
                throw new OverGoods("해당 상품은 매진되었습니다.");
            }
        } catch (PossibleTime e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");

        } catch (OverGoods e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class PossibleTime extends Exception {
    public PossibleTime(String message) {
        super(message);
    }
}

class OverGoods extends Exception {
    public OverGoods(String message) {
        super(message);
    }
}
