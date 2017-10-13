package lesson5;

public class Money {
    ////public static final Currency WON = new Money(); // 상수 정의 전용.

    private final int quantity;
    private final Currency currency;

    private Money(){ // 상수 정의 전용 생성자
        quantity = 0; // final을 쓰면 초기화를 반드시 해야 함!!!
        currency = null; // final을 쓰면 초기화를 반드시 해야 함!!!
    }
    // Money 가 아니라 Currency라는 형이 필요함.

    public Money(Currency currency, int q) { //생성자 (통화단위, 금액)
        this.currency = currency;
        this.quantity = q;
    }

    public int getMoney(Currency currency) {
        return currency.changeMoney(this.currency, this.quantity); // 원하는 화폐가치를 지금 환율과 지금 금액으로 계산
    }
}
