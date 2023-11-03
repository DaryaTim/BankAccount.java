public class CardAccount extends BankAccount {
    public CardAccount(double account, double sum) {
        super(account, sum);
    }

    public void sum(double getSum) {
        super.get(getSum());
        System.out.println("Комиссия 1%");
        System.out.println("Баланс: " + (sum - (getSum() * 0.01)));
    }
}
