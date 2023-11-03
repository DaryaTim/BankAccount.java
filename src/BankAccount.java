public class BankAccount {
    double account;
    double sum;

    public BankAccount(double account, double sum) {
        this.account = account;
        this.sum = sum;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void put(double putMoney) {
        if (putMoney <= 0) {
            System.out.println("Ваш баланс не изменился");
        } else {
                System.out.println("Баланс пополнен");
                sum = putMoney + sum;
                System.out.println("Текщий баланс: " + sum);
            }
        }
    public void get (double getMoney){
        if ((getMoney > 0) & (getMoney < sum)) {
             System.out.println("Выдано " + getMoney + " руб");
                sum = sum - getMoney;
                System.out.println("Текущий баланс, руб:" + sum);
        } else if (getMoney > sum) {
             System.out.println("Недостаточно средств");
        } else {
            System.out.println("Сумма введена неверно. Повторите попытку.");
        }
    }
}

