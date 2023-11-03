public class Main {
    public static void main(String[] args) {
        BankAccount o = new BankAccount(897, 80000);
        o.put(100);
        o.get(100);

        CardAccount oleg = new CardAccount(598, 500);
        oleg.put(1000);
        oleg.get(100);
    }
}

