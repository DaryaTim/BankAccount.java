import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome = LocalDate.now();
    public DepositAccount(double account, double sum) {
        super(account, sum);
    }

    public void put(double putSum, String data) {
        super.put (putSum);
        LocalDate lastIncome = LocalDate.parse(data);
        System.out.println(lastIncome);
        }

    public void get (double getSum, String data) {
        LocalDate lastIncome = LocalDate.parse(data);

        Period between = Period.between(lastIncome, LocalDate.now());

        if (!between.isNegative()) {
            System.out.println("Недоступно");
        } else {
            super.get(getSum);
        }
    }
}
