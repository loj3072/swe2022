package lesson5;

public class Banker {
    public boolean requestDeposit(DepositRequest req){ //입금요청 -수락이 됐는지 안됐는지 boolean으로 // 실제로는 그 결과값도 타입으로 해야함
        Account account = req.getDepositAccount();
        if (!account.isDepositable()) return false;
        Money money = req.getMoney();
        if (Banker.isMinimumLimit(money)) return false;
        return true;
    }

    public static final Money MINIMUM = new Money(Currency.WON, 100);
    private static boolean isMinimumLimit(Money money) {
        return money.getMoney(Currency.WON) < MINIMUM.getMoney(Currency.WON);
    }
}
