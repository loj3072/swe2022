package lesson5;

public interface DepositRequest extends Request{ //프로토콜(인터페이스)의 확장! Customer 와 Money 정보
    Account getDepositAccount();
}
